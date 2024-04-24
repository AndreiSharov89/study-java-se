package itmo.java.basics.task2;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class NetworkIP4 {
    private String networkInput;
    private String networkAddress;
    private String networkMask;
    private Inet4Address Inet4networkAddress;
    private int prefixLength;
    private Inet4Address Inet4networkMask;
    private long count;

    public NetworkIP4() throws UnknownHostException {
        this.networkInput = "0.0.0.0/0";
        this.networkAddress = "0.0.0.0";
        this.networkMask = "0.0.0.0";
        this.prefixLength = 0;
        this.Inet4networkAddress = (Inet4Address) Inet4Address.getByName(this.networkAddress);
        this.Inet4networkMask = (Inet4Address) Inet4Address.getByName(this.networkMask);
        this.count = (long) Math.pow(2, (32 - this.prefixLength));
    }

    public NetworkIP4(String networkInput) throws UnknownHostException {
        String[] parts = networkInput.split("/");
        this.networkInput = networkInput;
        //this.networkInput = parts[0];
        if (parts.length < 2) {
            this.prefixLength = 32;
        } else {
            this.prefixLength = Integer.parseInt(parts[1]);
        }
        this.count = (long) Math.pow(2, (32 - this.prefixLength));
        long prefix = (long) Math.pow(2, this.prefixLength);
        if (prefix >= Math.pow(2, 24)) {
            this.networkMask = ("255.255.255." + (int) (256 - (256 / (prefix / Math.pow(2, 24)))));
        } else if (prefix >= Math.pow(2, 16)) {
            this.networkMask = ("255.255." + (int) (256 - (256 / (prefix / Math.pow(2, 16)))) + ".0");
        } else if (prefix >= Math.pow(2, 8)) {
            this.networkMask = ("255." + (int) (256 - (256 / (prefix / Math.pow(2, 8)))) + ".0.0");
        } else {
            this.networkMask = ((int) (256 - (256 / prefix)) + ".0.0.0");
        }
        this.Inet4networkMask = (Inet4Address) Inet4Address.getByName(this.networkMask);
        String[] inputs = (parts[0]).split("\\.");
        int[] inp = new int[4];
        for (int i = 0; i < 4; i++) {
            inp[i] = Integer.parseInt(inputs[i]);
        }
        String[] nMas = (this.networkMask).split("\\.");
        int[] nMask = new int[4];
        for (int i = 0; i < 4; i++) {
            nMask[i] = Integer.parseInt(nMas[i]);
        }
        for (int i = 0; i < 4; i++) {
            if (inp[i] > nMask[i] && nMask[i] == 0) {
                inp[i] = nMask[i];
                ;
            } else if (inp[i] % (256 - nMask[i]) > 0) {
                inp[i] = inp[i] - (inp[i] % (256 - nMask[i]));
            }
        }
        this.networkAddress = ((int) inp[0] + "." + (int) inp[1] + "." + (int) inp[2] + "." + (int) inp[3]);
        this.Inet4networkAddress = (Inet4Address) Inet4Address.getByName(this.networkAddress);
    }

    public NetworkIP4(String networkInput, String networkMask) throws UnknownHostException {
        this.networkMask = networkMask;
        this.networkInput = networkInput;
        String[] nMaskString = (this.networkMask).split("\\.");
        int[] nMask = new int[4];
        int octetMask = 0;
        int octetCount = 4;
        for (int i = 3; i >= 0; i--) {
            nMask[i] = Integer.parseInt(nMaskString[i]);
            if (nMask[i] == 0) {
                octetCount--;
            } else {
                if (nMask[i] < 255) {
                    for (int j = 1; j < 9; j++) {
                        //System.out.println(j);
                        if ((256 - nMask[i]) >= (int) Math.pow(2, j)) {
                            octetMask++;
                        }
                        if ((256 - nMask[i]) == (int) Math.pow(2, j)) {
                            break;
                        }
                    }
                }
            }
        }
        this.prefixLength = octetCount * 8 - octetMask;

        this.count = (long) Math.pow(2, (32 - this.prefixLength));
        long prefix = (long) Math.pow(2, this.prefixLength);
        this.Inet4networkMask = (Inet4Address) Inet4Address.getByName(this.networkMask);
        String[] inputs = (networkInput).split("\\.");
        int[] inp = new int[4];
        for (int i = 0; i < 4; i++) {
            inp[i] = Integer.parseInt(inputs[i]);
        }
        String[] nMas = (this.networkMask).split("\\.");
        for (int i = 0; i < 4; i++) {
            nMask[i] = Integer.parseInt(nMas[i]);
        }
        for (int i = 0; i < 4; i++) {
            if (inp[i] > nMask[i] && nMask[i] == 0) {
                inp[i] = nMask[i];
                ;
            } else if (inp[i] % (256 - nMask[i]) > 0) {
                inp[i] = inp[i] - (inp[i] % (256 - nMask[i]));
            }
        }
        this.networkAddress = ((int) inp[0] + "." + (int) inp[1] + "." + (int) inp[2] + "." + (int) inp[3]);
        this.Inet4networkAddress = (Inet4Address) Inet4Address.getByName(this.networkAddress);
    }

    @Override
    public String toString() {
        String a = ("Ввод: " + this.networkInput + " Сеть: " +
                this.networkAddress + "/" + this.prefixLength + " с маской " + this.networkMask + "\nна "
                + this.count + " IP-адресов"
        );
        return a;
    }


}

