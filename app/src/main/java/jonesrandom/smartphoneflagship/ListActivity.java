package jonesrandom.smartphoneflagship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity {

    @BindView(R.id.list)
    RecyclerView list;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ButterKnife.bind(this);

        toolbar.setTitle("Daftar Smartphone");

        list.setHasFixedSize(true);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new Adapter(Data.getData(), new Adapter.OnItemClickListener() {
            @Override
            public void onClick(ModelSmartphone smartphone) {

                Bundle bind = new Bundle();
                bind.putParcelable("DATA", smartphone);

                Intent detail = new Intent(ListActivity.this, MainActivity.class);
                detail.putExtras(bind);
                startActivity(detail);
            }
        }));
    }
}
