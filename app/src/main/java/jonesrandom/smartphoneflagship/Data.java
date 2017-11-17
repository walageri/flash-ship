package jonesrandom.smartphoneflagship;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonesrandom on 10/24/17.
 *
 */

public class Data {

    public static List<ModelSmartphone> getData() {

        List<ModelSmartphone> data = new ArrayList<>();
        data.add(new ModelSmartphone(
                "Apple iPhone 7 Plus",
                "iOS 10.0.1, upgradable to iOS 10.2",
                "ᵜ versi 32 GB = Rp 13.700.000\nᵜ Versi 128 GB = 15.500.000\nᵜ Versi 256 GB = 17.200.000",
                "LED-backlit IPS LCD, capacitive touchscreen, 16M colors 5.5 inches 1080 x 1920 pixels (~401 ppi pixel density)",
                "ᵜ Belakang :Dual 12 MP, (28mm, f/1.8, OIS & 56mm, f/2.8), phase detection autofocus, 2x optical zoom, quad-LED (dual tone) flash\n\nᵜ Depan :7 MP, f/2.2, 32mm, 1080p@30fps, 720p@240fps, face detection, HDR, panorama",
                "Apple A10 Fusion",
                "Quad-core 2.23 GHz",
                "(six-core graphics)",
                "ᵜ RAM :3 GB RAM\n\nᵜ Internal :32/128/256 GB, GB",
                "Non-removable Li-Ion 2900 mAh",
                R.drawable.iphone7
        ));
        data.add(new ModelSmartphone(
                "LG V20",
                "Android OS, v7.0 (Nougat)",
                "Rp. 9.499.000",
                "IPS LCD capacitive touchscreen 5.7 inches 1440 x 2560 pixels (~513 ppi pixel density)",
                "ᵜ Belakang :Dual 16 MP (29mm, f/1.8) + 8 MP (12mm, f/2.4), laser autofocus, OIS, LED flash\nᵜ Depan :5 MP, f/1.9",
                "Qualcomm MSM8996 Snapdragon 820",
                "Quad-core (2×2.15 GHz Kryo & 2×1.6 GHz Kryo)",
                "Adreno 530",
                "ᵜ RAM :4 GB RAM\nᵜ Internal :32/64 GB",
                "\tRemovable Li-Ion 3200 mAh battery",
                R.drawable.lgv20
        ));
        data.add(new ModelSmartphone(
                "Xiaomi Mi Mix",
                "Android OS, v6.0 (Marshmallow)",
                "ᵜ Xiaomi Mi Mix Standar : RMB 3499 (sekitar Rp 6,7 jutaan)\nᵜ Xiaomi Mi Mix 18k : RMB 3.999 (sekitar Rp 7,6 jutaan)",
                "IPS LCD capacitive touchscreen 6.4 inches 1080 x 2040 pixels (~362 ppi pixel density)",
                "ᵜ Belakang :16 MP, f/2.0, EIS (gyro), phase detection autofocus, dual-LED (dual tone) flash\n\nᵜ Depan :5 MP",
                "Qualcomm MSM8996 Snapdragon 821",
                "Quad-core (2×2.35 GHz Kryo & 2×2.19 GHz Kryo)",
                "Adreno 530",
                "ᵜ RAM :4 GB, 6 GB RAM\nᵜ Internal :128 GB, 256 GB",
                "Non-removable Li-Ion 4400 mAh battery",
                R.drawable.mimix

        ));
        data.add(new ModelSmartphone(
                "OnePlus 3T",
                "Android OS, v6.0 (Marshmallow), planned upgrade to v7.0 (Nougat)",
                "ᵜ 64 GB : USD$439 (Rp. 5.8 Jutaan)\nᵜ 128 GB : USD$479 (Rp. 6.3 Jutaan)",
                "Optic AMOLED capacitive touchscreen 5.5 inches 1080 x 1920 pixels (~401 ppi pixel density)",
                "ᵜ Belakang :16 MP, f/2.0, phase detection autofocus, OIS, LED flash\n\nᵜ Depan :16 MP, f/2.0, 1.0 µm pixel size, 1080p",
                "Qualcomm MSM8996 Snapdragon 821",
                "Quad-core (2×2.35 GHz Kryo & 2×1.6 GHz Kryo)",
                "Adreno 530",
                "ᵜ RAM :6 GB RAM\nᵜ Internal :64/128 GB",
                "Non-removable Li-Ion 3400 mAh battery",
                R.drawable.oneplus3t
        ));
        data.add(new ModelSmartphone(
                "Samsung Galaxy S7 Edge",
                "Android OS, v6.0 (Marshmallow)",
                "Versi 32 GB : Rp 9.400.000",
                "Super AMOLED capacitive touchscreen 5.5 inches 1440 x 2560 pixels (~534 ppi pixel density)",
                "ᵜ Belakang :12 MP, f/1.7, 26mm, phase detection autofocus, OIS, LED flash\n\nᵜ Depan :5 MP, 1/4.1″ sensor size, 1.34 µm pixel size, f/1.7, 22mm, dual video call, Auto HDR",
                "ᵜ Qualcomm MSM8996 Snapdragon 820\n\nᵜ Exynos 8890 Octa",
                "ᵜ Quad-core (2×2.15 GHz Kryo & 2×1.6 GHz Kryo)\n\nᵜ Octa-core (4×2.3 GHz Mongoose & 4×1.6 GHz Cortex-A53)",
                "ᵜ Adreno 530\n\nᵜ Mali-T880 MP12",
                "ᵜ RAM :4 GB RAM\nᵜ Internal :32/64 GB",
                "Non-removable Li-Ion 3600 mAh battery",
                R.drawable.s7_edge
        ));


        return data;
    }
}
