package jonesrandom.smartphoneflagship;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.collapsing)
    CollapsingToolbarLayout collapsingToolbarLayout;

    @BindView(R.id.detail_icon)
    ImageView icon;

    @BindView(R.id.detail_nama)
    TextView nama;

    @BindView(R.id.detail_operation)
    TextView operation;

    @BindView(R.id.detail_layar)
    TextView layar;

    @BindView(R.id.detail_harga)
    TextView harga;

    @BindView(R.id.detail_batteri)
    TextView batteri;

    @BindView(R.id.detail_chipset)
    TextView chipset;

    @BindView(R.id.detail_prosesor)
    TextView prosesor;

    @BindView(R.id.detail_memori)
    TextView memori;

    @BindView(R.id.detail_gpu)
    TextView gpu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        collapsingToolbarLayout.setExpandedTitleColor(Color.TRANSPARENT);

        ModelSmartphone data = getIntent().getExtras().getParcelable("DATA");
        bind(data);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Detail Smartphone");
        }

        bind(data);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }

    private void bind(ModelSmartphone smartphone){

        icon.setImageResource(smartphone.getGambar());

        nama.setText(smartphone.getNama());
        operation.setText(smartphone.getOs());
        layar.setText(smartphone.getLayar());
        harga.setText(smartphone.getHarga());
        batteri.setText(smartphone.getBattery());
        chipset.setText(smartphone.getChipset());
        prosesor.setText(smartphone.getProsesor());
        memori.setText(smartphone.getMemori());
        gpu.setText(smartphone.getGPU());

    }
}
