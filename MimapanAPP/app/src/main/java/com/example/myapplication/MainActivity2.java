package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {
    public Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25, button26, button27, button28, button29, button30, button31, button32, button33, button34, button35, button36, button37, btn_go;
    public Button bt_1s, bt_2s, bt_3s, bt_4s,bt_5s;
    public TextView txt_res,test,txt_num,txt_ans;
    public Spinner spn_item;
    //public String total="";
    public ArrayList<Integer> total = new ArrayList<Integer>();
    //public String  A[]={"ㄅ","ㄆ","ㄇ","ㄈ","ㄉ","ㄊ","ㄋ","ㄌ","ㄍ","ㄎ","ㄏ","ㄐ","ㄑ","ㄒ","ㄓ","ㄔ","ㄕ","ㄖ","ㄗ","ㄘ","ㄙ","/"};
    //public String  B[]={"一","ㄨ","ㄩ","/"};
    //public String  C[]={"ㄚ","ㄛ","ㄜ","ㄝ","ㄞ","ㄟ","ㄠ","ㄡ","ㄢ","ㄣ","ㄤ","ㄥ","ㄦ","/"};
    //public String  D[]={"_","ˊ","ˇ","ˋ"};
    public String str[]={"ㄅ","ㄆ","ㄇ","ㄈ","ㄉ","ㄊ","ㄋ","ㄌ","ㄍ","ㄎ","ㄏ","ㄐ","ㄑ","ㄒ","ㄓ","ㄔ","ㄕ","ㄖ","ㄗ","ㄘ","ㄙ","一","ㄨ","ㄩ","ㄚ","ㄛ","ㄜ","ㄝ","ㄞ","ㄟ","ㄠ","ㄡ","ㄢ","ㄣ","ㄤ","ㄥ","ㄦ"," "," "," "," ","_","ˊ","ˇ","ˋ","."};
    public String items[] ={"0","1","2","3","4","5","6","7","8","9","10","11","12","13"};
    public String s1,s2,s3;
    //public int pins[] =new int[100];
    public int locate;
    Object[] pin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findview();
        //select();
    }
    public void ArrayListtoArray() {
        /*for (int i =0;i< total.size();i++){
            int a= Integer.decode(total.get(i));
            a= pin[i];
            //pin[i]=Integer.decode(total.get(i));
        }*/
        //String[] array = total.toArray(new String[total.size()]);
        pin = total.toArray();
    }


    private void findview() {
        spn_item=findViewById(R.id.spn_item);
        btn_go = findViewById(R.id.btn_go);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);
        button26 = findViewById(R.id.button26);
        button27 = findViewById(R.id.button27);
        button28 = findViewById(R.id.button28);
        button29 = findViewById(R.id.button29);
        button30 = findViewById(R.id.button30);
        button31 = findViewById(R.id.button31);
        button32 = findViewById(R.id.button32);
        button33 = findViewById(R.id.button33);
        button34 = findViewById(R.id.button34);
        button35 = findViewById(R.id.button35);
        button36 = findViewById(R.id.button36);
        button37 = findViewById(R.id.button37);
        test = findViewById(R.id.test);
        button1.setOnClickListener(btnClickListener);
        button2.setOnClickListener(btnClickListener);
        button3.setOnClickListener(btnClickListener);
        button4.setOnClickListener(btnClickListener);
        button5.setOnClickListener(btnClickListener);
        button6.setOnClickListener(btnClickListener);
        button7.setOnClickListener(btnClickListener);
        button8.setOnClickListener(btnClickListener);
        button9.setOnClickListener(btnClickListener);
        button10.setOnClickListener(btnClickListener);
        button11.setOnClickListener(btnClickListener);
        button12.setOnClickListener(btnClickListener);
        button13.setOnClickListener(btnClickListener);
        button14.setOnClickListener(btnClickListener);
        button15.setOnClickListener(btnClickListener);
        button16.setOnClickListener(btnClickListener);
        button17.setOnClickListener(btnClickListener);
        button18.setOnClickListener(btnClickListener);
        button19.setOnClickListener(btnClickListener);
        button20.setOnClickListener(btnClickListener);
        button21.setOnClickListener(btnClickListener);
        button22.setOnClickListener(btnClickListener);
        button23.setOnClickListener(btnClickListener);
        button24.setOnClickListener(btnClickListener);
        button25.setOnClickListener(btnClickListener);
        button26.setOnClickListener(btnClickListener);
        button27.setOnClickListener(btnClickListener);
        button28.setOnClickListener(btnClickListener);
        button29.setOnClickListener(btnClickListener);
        button30.setOnClickListener(btnClickListener);
        button31.setOnClickListener(btnClickListener);
        button32.setOnClickListener(btnClickListener);
        button33.setOnClickListener(btnClickListener);
        button34.setOnClickListener(btnClickListener);
        button35.setOnClickListener(btnClickListener);
        button36.setOnClickListener(btnClickListener);
        button37.setOnClickListener(btnClickListener);

        bt_1s = findViewById(R.id.bt_1s);
        bt_2s = findViewById(R.id.bt_2s);
        bt_3s = findViewById(R.id.bt_3s);
        bt_4s = findViewById(R.id.bt_4s);
        bt_5s = findViewById(R.id.bt_5s);

        bt_1s.setOnClickListener(btnClickListener);
        bt_2s.setOnClickListener(btnClickListener);
        bt_3s.setOnClickListener(btnClickListener);
        bt_4s.setOnClickListener(btnClickListener);
        bt_5s.setOnClickListener(btnClickListener);

        btn_go.setOnClickListener(btnGo);
        spn_item.setOnItemSelectedListener(spnListener);
        ArrayAdapter<String> adapt_who=new ArrayAdapter <String>
                (this,android.R.layout.simple_spinner_item,items);
        adapt_who.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn_item.setAdapter(adapt_who);
        spn_item.setOnItemSelectedListener(spnListener);

        txt_res = findViewById(R.id.txt_res);
        txt_num= findViewById(R.id.txt_num);
        txt_ans= findViewById(R.id.txt_ans);
    }

    private Button.OnClickListener btnGo = v -> {
        ArrayListtoArray();
        //txt_res.setText(pin[0].toString());
        locate =Integer.decode(s1);
        //test.setText(pin[0].toString());
        select();
        encry();
        //txt_ans.setText(pin[0].toString()+pin[1].toString()+pin[2].toString());
    };

    private void encry() {
        //replace the number to bopomofo-chewing
        s2=(test.getText().toString());
        replace();
        txt_ans.setText(s3);
    }
    private void replace() {
        s3 = s2.replace("11,","ㄐ").replace("12,","ㄑ")
                .replace("13,","ㄒ").replace("14,","ㄓ")
                .replace("15,","ㄔ").replace("16,","ㄕ")
                .replace("17,","ㄖ").replace("18,","ㄗ")
                .replace("19,","ㄘ").replace("20,","ㄙ")
                .replace("21,","ㄧ").replace("22,","ㄨ")
                .replace("23,","ㄩ").replace("24,","ㄚ")
                .replace("25,","ㄛ").replace("26,","ㄜ")
                .replace("27,","ㄝ").replace("28,","ㄞ")
                .replace("29,","ㄟ").replace("30,","ㄠ")
                .replace("31,","ㄡ").replace("32,","ㄢ")
                .replace("33,","ㄣ").replace("34,","ㄤ")
                .replace("35,","ㄥ").replace("36,","ㄦ")
                .replace("37,","_").replace("38,","ˊ")
                .replace("39,","ˇ").replace("40,","ˋ").replace("41,","˙")
                .replace("0,","ㄅ").replace("1,","ㄆ").replace("2,","ㄇ")
                .replace("3,","ㄈ").replace("4,","ㄉ")
                .replace("5,","ㄊ").replace("6,","ㄋ")
                .replace("7,","ㄌ").replace("8,","ㄍ")
                .replace("9","ㄎ").replace("10,","ㄏ");
    }
    private void select() {
        int a=0;
        //String aa=String.valueOf(total.size());
        //test.setText(aa);
        for(int i=0;i<total.size();i++) {
            if ((Integer)pin[i] >= 0 && (Integer)pin[i] <= 20) {
                if((Integer)pin[i]+locate>20){
                    a=(Integer)pin[i]+locate;
                    pin[i] =a-21;
                    test.setText(test.getText()+pin[i].toString()+',');
                    //txt_res.setText(txt_res.getText()+button2.getText().toString());
                }else{
                    pin[i]=(Integer)pin[i]+locate;
                    //test.setText(pin[i].toString());
                    test.setText(test.getText()+pin[i].toString()+',');
                }
            }else if ((Integer)pin[i]>20&&(Integer)pin[i]<24) {
                if((Integer)pin[i]+locate>23){
                    a=(Integer)pin[i]+locate;
                    pin[i]=(a%3)+21;
                    //test.setText(pin[i].toString());
                    test.setText(test.getText()+pin[i].toString()+',');
                }else{
                    //pin[i]+=locate;
                    pin[i]=(Integer)pin[i]+locate;
                    //test.setText(pin[i].toString());
                    test.setText(test.getText()+pin[i].toString()+',');
                }
            }else if((Integer)pin[i]>23&&(Integer)pin[i]<37) {
                if((Integer)pin[i]+locate>36){
                    a=(Integer)pin[i]+locate;
                    //pin[i]=(a%13)+24;
                    pin[i]=a-13;//28+10=38 38-13=25
                    //test.setText(pin[i].toString());
                    test.setText(test.getText()+pin[i].toString()+',');

                }else{
                    pin[i]=(Integer)pin[i]+locate;
                    //test.setText(pin[i].toString());
                    test.setText(test.getText()+pin[i].toString()+',');
                }

            }else if((Integer)pin[i]>36&&(Integer)pin[i]<42) {
                if((Integer)pin[i]+locate>41){
                    a=(Integer)pin[i]+locate;
                    //pin[i]=(a%4)+37;
                    if(a%5==2)
                        pin[i]=37;
                    else if(a%5==3)
                        pin[i]=38;
                    else if(a%5==4)
                        pin[i]=39;
                    else if(a%5==0)
                        pin[i]=40;
                    else {
                        pin[i]=41;
                    }

                    //test.setText(pin[i].toString());
                    test.setText(test.getText()+pin[i].toString()+',');
                }else{
                    pin[i]=(Integer)pin[i]+locate;
                    //test.setText(pin[i].toString());
                    test.setText(test.getText()+pin[i].toString()+',');
                }
            }

        }
    }
    private Spinner.OnItemSelectedListener spnListener = new Spinner.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parents, View view, int i, long l) {
            s1=parents.getSelectedItem().toString();
            txt_num.setText(s1);
            //s1=txt_item.toString();
            Log.d("sel",s1);
        }
        @Override
        public void onNothingSelected(AdapterView<?> adapterView) { }
    };

    private Button.OnClickListener btnClickListener = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button1:
                    txt_res.setText(txt_res.getText()+"ㄅ");
                    total.add(0);
                    //test.setText(total.get(0));
                    break;
                case R.id.button2:
                    txt_res.setText(txt_res.getText()+button2.getText().toString());
                    total.add(1);
                    break;
                case R.id.button3:
                    txt_res.setText(txt_res.getText()+button3.getText().toString());
                    total.add(2);
                    break;
                case R.id.button4:
                    txt_res.setText(txt_res.getText()+button4.getText().toString());
                    total.add(3);
                    break;
                case R.id.button5:
                    txt_res.setText(txt_res.getText()+button5.getText().toString());
                    total.add(4);
                    break;
                case R.id.button6:
                    txt_res.setText(txt_res.getText()+button6.getText().toString());
                    total.add(5);
                    break;
                case R.id.button7:
                    txt_res.setText(txt_res.getText()+button7.getText().toString());
                    total.add(6);
                    break;
                case R.id.button8:
                    txt_res.setText(txt_res.getText()+button8.getText().toString());
                    total.add(7);
                    break;
                case R.id.button9:
                    txt_res.setText(txt_res.getText()+button9.getText().toString());
                    total.add(8);
                    break;
                case R.id.button10:
                    txt_res.setText(txt_res.getText()+button10.getText().toString());
                    total.add(9);
                    break;
                case R.id.button11:
                    txt_res.setText(txt_res.getText()+button11.getText().toString());
                    total.add(10);
                    break;
                case R.id.button12:
                    txt_res.setText(txt_res.getText()+button12.getText().toString());
                    total.add(11);
                    break;
                case R.id.button13:
                    txt_res.setText(txt_res.getText()+button13.getText().toString());
                    total.add(12);
                    break;
                case R.id.button14:
                    txt_res.setText(txt_res.getText()+button14.getText().toString());
                    total.add(13);
                    break;
                case R.id.button15:
                    txt_res.setText(txt_res.getText()+button15.getText().toString());
                    total.add(14);
                    break;
                case R.id.button16:
                    txt_res.setText(txt_res.getText()+button16.getText().toString());
                    total.add(15);
                    break;
                case R.id.button17:
                    txt_res.setText(txt_res.getText()+button17.getText().toString());
                    total.add(16);
                    break;
                case R.id.button18:
                    txt_res.setText(txt_res.getText()+button18.getText().toString());
                    total.add(17);
                    break;
                case R.id.button19:
                    txt_res.setText(txt_res.getText()+button19.getText().toString());
                    total.add(18);
                    break;
                case R.id.button20:
                    txt_res.setText(txt_res.getText()+button20.getText().toString());
                    total.add(19);
                    break;
                case R.id.button21:
                    txt_res.setText(txt_res.getText()+button21.getText().toString());
                    total.add(20);
                    break;
                case R.id.button22:
                    txt_res.setText(txt_res.getText()+button22.getText().toString());
                    total.add(21);
                    break;
                case R.id.button23:
                    txt_res.setText(txt_res.getText()+button23.getText().toString());
                    total.add(22);
                    break;
                case R.id.button24:
                    txt_res.setText(txt_res.getText()+button24.getText().toString());
                    total.add(23);
                    break;
                case R.id.button25:
                    txt_res.setText(txt_res.getText()+button25.getText().toString());
                    total.add(24);
                    break;
                case R.id.button26:
                    txt_res.setText(txt_res.getText()+button26.getText().toString());
                    total.add(25);
                    break;
                case R.id.button27:
                    txt_res.setText(txt_res.getText()+button27.getText().toString());
                    total.add(26);
                    break;
                case R.id.button28:
                    txt_res.setText(txt_res.getText()+button28.getText().toString());
                    total.add(27);
                    break;
                case R.id.button29:
                    txt_res.setText(txt_res.getText()+button29.getText().toString());
                    total.add(28);
                    break;
                case R.id.button30:
                    txt_res.setText(txt_res.getText()+button30.getText().toString());
                    total.add(29);
                    break;
                case R.id.button31:
                    txt_res.setText(txt_res.getText()+button31.getText().toString());
                    total.add(30);
                    break;
                case R.id.button32:
                    txt_res.setText(txt_res.getText()+button32.getText().toString());
                    total.add(31);
                    break;
                case R.id.button33:
                    txt_res.setText(txt_res.getText()+button33.getText().toString());
                    total.add(32);
                    break;
                case R.id.button34:
                    txt_res.setText(txt_res.getText()+button34.getText().toString());
                    total.add(33);
                    break;
                case R.id.button35:
                    txt_res.setText(txt_res.getText()+button35.getText().toString());
                    total.add(34);
                    break;
                case R.id.button36:
                    txt_res.setText(txt_res.getText()+button36.getText().toString());
                    total.add(35);
                    break;
                case R.id.button37:
                    txt_res.setText(txt_res.getText()+button37.getText().toString());
                    total.add(36);
                    break;
                case R.id.bt_1s:
                    txt_res.setText(txt_res.getText()+bt_1s.getText().toString());
                    total.add(37);
                    break;
                case R.id.bt_2s:
                    txt_res.setText(txt_res.getText()+bt_2s.getText().toString());
                    total.add(38);
                    break;
                case R.id.bt_3s:
                    txt_res.setText(txt_res.getText()+bt_3s.getText().toString());
                    total.add(39);
                    break;
                case R.id.bt_4s:
                    txt_res.setText(txt_res.getText()+bt_4s.getText().toString());
                    total.add(40);
                    break;
                case R.id.bt_5s:
                    //txt_res.setText(txt_res.getText()+("["));
                    txt_res.setText(txt_res.getText()+"˙");
                    total.add(41);
                    break;
            }
        }
    };


}

