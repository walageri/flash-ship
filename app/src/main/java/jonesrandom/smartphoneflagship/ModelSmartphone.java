package jonesrandom.smartphoneflagship;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jonesrandom on 10/24/17.
 *
 */

public class ModelSmartphone implements Parcelable{

    private String Nama;
    private String Os;
    private String Harga;
    private String Layar;
    private String Kamera;
    private String Chipset;
    private String Prosesor;
    private String GPU;
    private String Memori;
    private String Battery;
    private int Gambar;

    public ModelSmartphone(String nama, String os, String harga, String layar, String kamera, String chipset, String prosesor, String GPU, String memori, String battery , int Gambar) {
        Nama = nama;
        Os = os;
        Harga = harga;
        Layar = layar;
        Kamera = kamera;
        Chipset = chipset;
        Prosesor = prosesor;
        this.GPU = GPU;
        Memori = memori;
        Battery = battery;
        this.Gambar = Gambar;
    }

    protected ModelSmartphone(Parcel in) {
        Nama = in.readString();
        Os = in.readString();
        Harga = in.readString();
        Layar = in.readString();
        Kamera = in.readString();
        Chipset = in.readString();
        Prosesor = in.readString();
        GPU = in.readString();
        Memori = in.readString();
        Battery = in.readString();
        Gambar = in.readInt();
    }

    public static final Creator<ModelSmartphone> CREATOR = new Creator<ModelSmartphone>() {
        @Override
        public ModelSmartphone createFromParcel(Parcel in) {
            return new ModelSmartphone(in);
        }

        @Override
        public ModelSmartphone[] newArray(int size) {
            return new ModelSmartphone[size];
        }
    };

    public String getNama() {
        return Nama;
    }

    public String getOs() {
        return Os;
    }

    public String getHarga() {
        return Harga;
    }

    public String getLayar() {
        return Layar;
    }

    public String getKamera() {
        return Kamera;
    }

    public String getChipset() {
        return Chipset;
    }

    public String getProsesor() {
        return Prosesor;
    }

    public String getGPU() {
        return GPU;
    }

    public String getMemori() {
        return Memori;
    }

    public String getBattery() {
        return Battery;
    }

    public int getGambar() {
        return Gambar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Nama);
        dest.writeString(Os);
        dest.writeString(Harga);
        dest.writeString(Layar);
        dest.writeString(Kamera);
        dest.writeString(Chipset);
        dest.writeString(Prosesor);
        dest.writeString(GPU);
        dest.writeString(Memori);
        dest.writeString(Battery);
        dest.writeInt(Gambar);
    }
}
