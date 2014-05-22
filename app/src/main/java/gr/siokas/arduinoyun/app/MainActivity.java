package gr.siokas.arduinoyun.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity implements SendToYun.InputFromYun {

    Switch s, s2, s3, s4;
    Spinner sp1, sp2, sp3, sp4, sp5;
    RadioGroup rG1, rG2, rG3, rG4;
    RadioButton in1, out1, in2, out2, in3, out3, in4, out4;
    int pin1 = 0, pin4 = 0, pin2 = 0, pin3 = 0;

    @Override
    public void OnYunReply(SendToYun sendToYun, String response, String errorMsg) {
        System.out.println(response);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s = (Switch) findViewById(R.id.switch1);
        s2 = (Switch) findViewById(R.id.switch2);
        s3 = (Switch) findViewById(R.id.switch3);
        s4 = (Switch) findViewById(R.id.switch4);
        rG1 = (RadioGroup) findViewById(R.id.rPin1);
        rG2 = (RadioGroup) findViewById(R.id.rPin2);
        rG3 = (RadioGroup) findViewById(R.id.rPin3);
        rG4 = (RadioGroup) findViewById(R.id.rPin4);
        in1 = (RadioButton) findViewById(R.id.in1);
        out1 = (RadioButton) findViewById(R.id.out1);
        in2 = (RadioButton) findViewById(R.id.in2);
        out2 = (RadioButton) findViewById(R.id.out2);
        in3 = (RadioButton) findViewById(R.id.in3);
        out3 = (RadioButton) findViewById(R.id.out3);
        in4 = (RadioButton) findViewById(R.id.in4);
        out4 = (RadioButton) findViewById(R.id.out4);


        sp1 = (Spinner) findViewById(R.id.pins);
        sp2 = (Spinner) findViewById(R.id.pins2);
        sp3 = (Spinner) findViewById(R.id.pins3);
        sp4 = (Spinner) findViewById(R.id.pins4);

        List<String> list = new ArrayList<String>();
        list.add("Pin 1");
        list.add("Pin 2");
        list.add("Pin 3");
        list.add("Pin 4");
        list.add("Pin 5");
        list.add("Pin 6");
        list.add("Pin 7");
        list.add("Pin 8");
        list.add("Pin 9");
        list.add("Pin 10");
        list.add("Pin 11");
        list.add("Pin 12");
        list.add("Pin 13");

        ArrayAdapter<String> dataAd = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(dataAd);
        sp2.setAdapter(dataAd);
        sp3.setAdapter(dataAd);
        sp4.setAdapter(dataAd);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        pin1 = 1;
                        break;
                    case 1:
                        pin1 = 2;
                        break;
                    case 2:
                        pin1 = 3;
                        break;
                    case 3:
                        pin1 = 4;
                        break;
                    case 4:
                        pin1 = 5;
                        break;
                    case 5:
                        pin1 = 6;
                        break;
                    case 6:
                        pin1 = 7;
                        break;
                    case 7:
                        pin1 = 8;
                        break;
                    case 8:
                        pin1 = 9;
                        break;
                    case 9:
                        pin1 = 10;
                        break;
                    case 10:
                        pin1 = 11;
                        break;
                    case 11:
                        pin1 = 12;
                        break;
                    case 12:
                        pin1 = 13;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        pin2 = 1;
                        break;
                    case 1:
                        pin2 = 2;
                        break;
                    case 2:
                        pin2 = 3;
                        break;
                    case 3:
                        pin2 = 4;
                        break;
                    case 4:
                        pin2 = 5;
                        break;
                    case 5:
                        pin2 = 6;
                        break;
                    case 6:
                        pin2 = 7;
                        break;
                    case 7:
                        pin2 = 8;
                        break;
                    case 8:
                        pin2 = 9;
                        break;
                    case 9:
                        pin2 = 10;
                        break;
                    case 10:
                        pin2 = 11;
                        break;
                    case 11:
                        pin2 = 12;
                        break;
                    case 12:
                        pin2 = 13;
                        break;

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        pin3 = 1;
                        break;
                    case 1:
                        pin3 = 2;
                        break;
                    case 2:
                        pin3 = 3;
                        break;
                    case 3:
                        pin3 = 4;
                        break;
                    case 4:
                        pin3 = 5;
                        break;
                    case 5:
                        pin3 = 6;
                        break;
                    case 6:
                        pin3 = 7;
                        break;
                    case 7:
                        pin3 = 8;
                        break;
                    case 8:
                        pin3 = 9;
                        break;
                    case 9:
                        pin3 = 10;
                        break;
                    case 10:
                        pin3 = 11;
                        break;
                    case 11:
                        pin3 = 12;
                        break;
                    case 12:
                        pin3 = 13;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        pin4 = 1;
                        break;
                    case 1:
                        pin4 = 2;
                        break;
                    case 2:
                        pin4 = 3;
                        break;
                    case 3:
                        pin4 = 4;
                        break;
                    case 4:
                        pin4 = 5;
                        break;
                    case 5:
                        pin4 = 6;
                        break;
                    case 6:
                        pin4 = 7;
                        break;
                    case 7:
                        pin4 = 8;
                        break;
                    case 8:
                        pin4 = 9;
                        break;
                    case 9:
                        pin4 = 10;
                        break;
                    case 10:
                        pin4 = 11;
                        break;
                    case 11:
                        pin4 = 12;
                        break;
                    case 12:
                        pin4 = 13;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        in1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Input Mode
                if (in1.isChecked()) {
                    SendToYun send = new SendToYun("http://192.168.240.1/arduino/mode/" + pin1 + "/input", MainActivity.this);
                    send.connect();
                } else { // Output Mode
                    SendToYun send = new SendToYun("http://192.168.240.1/arduino/mode/" + pin1 + "/output", MainActivity.this);
                    send.connect();
                }
            }
        });

        in2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Input Mode
                if (in2.isChecked()) {
                    SendToYun send = new SendToYun("http://192.168.240.1/arduino/mode/" + pin2 + "/input", MainActivity.this);
                    send.connect();
                } else { // Output Mode
                    SendToYun send = new SendToYun("http://192.168.240.1/arduino/mode/" + pin2 + "/output", MainActivity.this);
                    send.connect();
                }
            }
        });

        in3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Input Mode
                if (in3.isChecked()) {
                    SendToYun send = new SendToYun("http://192.168.240.1/arduino/mode/" + pin3 + "/input", MainActivity.this);
                    send.connect();
                } else { // Output Mode
                    SendToYun send = new SendToYun("http://192.168.240.1/arduino/mode/" + pin3 + "/output", MainActivity.this);
                    send.connect();
                }
            }
        });

        in4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Input Mode
                if (in4.isChecked()) {
                    SendToYun send = new SendToYun("http://192.168.240.1/arduino/mode/" + pin1 + "/input", MainActivity.this);
                    send.connect();
                } else { // Output Mode
                    SendToYun send = new SendToYun("http://192.168.240.1/arduino/mode/" + pin1 + "/output", MainActivity.this);
                    send.connect();
                }
            }
        });


        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    // Input Mode
                    if (in1.isChecked()) {
                       // Do something here ... ... ...
                    } else { // Output Mode
                        SendToYun send = new SendToYun("http://192.168.240.1/arduino/digital/" + pin1 + "/1", MainActivity.this);
                        send.connect();
                    }

                } else {
                    // Input Mode
                    if (in1.isChecked()) {
                        // Do something here ... ... ...
                    } else { // Output Mode
                        SendToYun send = new SendToYun("http://192.168.240.1/arduino/digital/" + pin1 + "/0", MainActivity.this);
                        send.connect();
                    }
                }


            }
        });

        s2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    // Input Mode
                    if (in2.isChecked()) {
                        // Do something here ... ... ...
                    } else { // Output Mode
                        SendToYun send = new SendToYun("http://192.168.240.1/arduino/digital/" + pin2 + "/1", MainActivity.this);
                        send.connect();
                    }

                } else {
                    // Input Mode
                    if (in2.isChecked()) {
                        // Do something here ... ... ...
                    } else { // Output Mode
                        SendToYun send = new SendToYun("http://192.168.240.1/arduino/digital/" + pin2 + "/0", MainActivity.this);
                        send.connect();
                    }
                }


            }
        });

        s3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    // Input Mode
                    if (in3.isChecked()) {
                        // Do something here ... ... ...
                    } else { // Output Mode
                        SendToYun send = new SendToYun("http://192.168.240.1/arduino/digital/" + pin3 + "/1", MainActivity.this);
                        send.connect();
                    }

                } else {
                    // Input Mode
                    if (in3.isChecked()) {
                        // Do something here ... ... ...
                    } else { // Output Mode
                        SendToYun send = new SendToYun("http://192.168.240.1/arduino/digital/" + pin3 + "/0", MainActivity.this);
                        send.connect();
                    }
                }


            }
        });

        s4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    // Input Mode
                    if (in4.isChecked()) {
                        // Do something here ... ... ...
                    } else { // Output Mode
                        SendToYun send = new SendToYun("http://192.168.240.1/arduino/digital/" + pin4 + "/1", MainActivity.this);
                        send.connect();
                    }

                } else {
                    // Input Mode
                    if (in4.isChecked()) {
                        // Do something here ... ... ...
                    } else { // Output Mode
                        SendToYun send = new SendToYun("http://192.168.240.1/arduino/digital/" + pin4 + "/0", MainActivity.this);
                        send.connect();
                    }
                }


            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
