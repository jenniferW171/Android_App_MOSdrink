package tw.org.iii.drinkmos;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class ActMain extends AppCompatActivity {
    private View.OnClickListener btn01_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intCount = 1; //當項杯數
            if(intPrice == 0){ //判斷是否有先選擇品項
                IsSelect();
            }
            else if(isSub == true){ //判斷是否為減少杯
                drinkSelectSub();
            }
            else {
                drinkSelectAdd();
            }
        }
    };
    private View.OnClickListener btn02_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intCount = 2; //當項杯數
            if(intPrice == 0){ //判斷是否有先選擇品項
                IsSelect();
            }
            else if(isSub == true){ //判斷是否為減少杯
                drinkSelectSub();
            }
            else {
                drinkSelectAdd();
            }
        }
    };
    private View.OnClickListener btn03_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intCount = 3; //當項杯數
            if(intPrice == 0){ //判斷是否有先選擇品項
                IsSelect();
            }
            else if(isSub == true){ //判斷是否為減少杯
                drinkSelectSub();
            }
            else {
                drinkSelectAdd();
            }
        }
    };
    private View.OnClickListener btn04_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intCount = 4; //當項杯數
            if(intPrice == 0){ //判斷是否有先選擇品項
                IsSelect();
            }
            else if(isSub == true){ //判斷是否為減少杯
                drinkSelectSub();
            }
            else {
                drinkSelectAdd();
            }
        }
    };
    private View.OnClickListener btn05_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intCount = 5; //當項杯數
            if(intPrice == 0){ //判斷是否有先選擇品項
                IsSelect();
            }
            else if(isSub == true){ //判斷是否為減少杯
                drinkSelectSub();
            }
            else {
                drinkSelectAdd();
            }
        }
    };
    private View.OnClickListener btn06_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intCount = 6; //當項杯數
            if(intPrice == 0){ //判斷是否有先選擇品項
                IsSelect();
            }
            else if(isSub == true){ //判斷是否為減少杯
                drinkSelectSub();
            }
            else {
                drinkSelectAdd();
            }
        }
    };
    private View.OnClickListener btn07_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intCount = 7; //當項杯數
            if(intPrice == 0){ //判斷是否有先選擇品項
                IsSelect();
            }
            else if(isSub == true){ //判斷是否為減少杯
                drinkSelectSub();
            }
            else {
                drinkSelectAdd();
            }
        }
    };
    private View.OnClickListener btn08_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intCount = 8; //當項杯數
            if(intPrice == 0){ //判斷是否有先選擇品項
                IsSelect();
            }
            else if(isSub == true){ //判斷是否為減少杯
                drinkSelectSub();
            }
            else {
                drinkSelectAdd();
            }
        }
    };
    private View.OnClickListener btn09_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intCount = 9; //當項杯數
            if(intPrice == 0){ //判斷是否有先選擇品項
                IsSelect();
            }
            else if(isSub == true){ //判斷是否為減少杯
                drinkSelectSub();
            }
            else {
                drinkSelectAdd();
            }
        }
    };
    private View.OnClickListener btnRed_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if((isSub == true) && (isRed == false)) {
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setMessage("該筆訂單尚未有紅茶！\r\n請確認後重新輸入");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();
                isSub = false;
            }
            else{
                txtView.setText("20");
                intItem = 1;
                intPrice = 20;
                strMsg1 = "\r\n紅茶 20元*";
                isRed = true;
            }
        }
    };
    private View.OnClickListener btnGreen_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if((isSub == true) && (isGreen == false)) {
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setMessage("該筆訂單尚未有綠茶！\r\n請確認後重新輸入");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();
                isSub = false;
            }
            else {
                txtView.setText("20");
                intItem = 2;
                intPrice = 20;
                strMsg1 = "\r\n綠茶 20元*";
                isGreen = true;
            }
        }
    };
    private View.OnClickListener btnChincha_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if((isSub == true) && (isChincha == false)) {
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setMessage("該筆訂單尚未有青茶！\r\n請確認後重新輸入");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();
                isSub = false;
            }
            else {
                txtView.setText("25");
                intItem = 3;
                intPrice = 25;
                strMsg1 = "\r\n青茶 25元*";
                isChincha = true;
            }
        }
    };
    private View.OnClickListener btnUlongcha_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if((isSub == true) && (isUlongcha == false)) {
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setMessage("該筆訂單尚未有烏龍茶！\r\n請確認後重新輸入");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();
                isSub = false;
            }
            else {
                txtView.setText("30");
                intItem = 4;
                intPrice = 30;
                strMsg1 = "\r\n烏龍茶 30元*";
                isUlongcha = true;
            }
        }
    };
    private final View.OnClickListener btnTotal_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            strTotal = String.valueOf(intTotal);
            intDayTotal += intTotal;
            strMsg2 += "\r\n====================\r\n小計為" + intTotal + "元";
            txtView.setText(strTotal);
            intTotal = 0;

            //AlertDialog.Builder builder = new AlertDialog.Builder(ActMain.this);
            //builder.setIcon(R.drawable.go);
            builder = new AlertDialog.Builder(ActMain.this);
            builder.setTitle("本訂單明細如下");
            builder.setMessage(strMsg2);
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    txtView.setText("0");
                    return;
                } });
            Dialog dialog = builder.create();
            dialog.show();

            strMsg2 = "";
            isRed = false; isGreen = false; isChincha = false; isUlongcha = false;
        }
    };
    private View.OnClickListener btnDayTotal_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if((intTRed == 0) & (intTGreen == 0) & (intChincha == 0) & (intUlongcha == 0)){
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setMessage("本日當未有鎖售記錄");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();

                ini();
            }
            else {
                //計算當日總銷售額
                intDayTotal = (intTRed * 20) + (intTGreen * 20) + (intChincha * 25) + (intUlongcha * 30);
                strDayTotal = String.valueOf(intDayTotal);
                txtView.setText(strDayTotal);
                strDayTotal = "紅茶共 " + intTRed + " 杯\r\n" +
                        "綠茶共 " + intTGreen + " 杯\r\n" +
                        "青茶共 " + intChincha + " 杯\r\n" +
                        "烏龍茶共 " + intUlongcha + " 杯\r\n" +
                        "====================\r\n" +
                        "總銷售金額為 " + intDayTotal + " 元" ;
                builder = new AlertDialog.Builder(ActMain.this);
                builder.setTitle("本日銷售品項明細如下");
                builder.setMessage(strDayTotal);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        txtView.setText("0");
                        return;
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();

                ini();
            }
        }
    };
    private View.OnClickListener btnSub_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            isSub = true;
        }
    };
    private View.OnClickListener btnOffer_click =  new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            builder = new AlertDialog.Builder(ActMain.this);
            //builder.setTitle("本訂單明細如下");
            builder.setMessage("目前沒有優惠活動");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    return;
                } });
            Dialog dialog = builder.create();
            dialog.show();
        }
    };
    private View.OnClickListener btnNoS_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            isNoS = true; //表示無糖
        }
    };
    private View.OnClickListener btnHalfS_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            isHalfS = true; //表示半糖
        }
    };
    private View.OnClickListener btnNoI_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            isNoI = true; //表示去冰
        }
    };
    private View.OnClickListener btnHalfI_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            isHalfI = true; //表示少冰
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.actmain);
        initial();

    }

    private void IsSelect(){
        //判斷選擇杯數前是否有選擇品項
        builder = new AlertDialog.Builder(ActMain.this);
        builder.setMessage("請先選擇飲料品項");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                return;
            } });
        Dialog dialog = builder.create();
        dialog.show();
    }

    private void drinkSelectAdd(){
        //判斷所選擇【新增】的品項類型並加總存入相關訊息
        switch (intItem) {
            case 1:
                intTRed += intCount;
                break;
            case 2:
                intTGreen += intCount;
                break;
            case 3:
                intChincha += intCount;
                break;
            case 4:
                intUlongcha += intCount;
                break;
        }
        intOrder = intPrice * intCount; //單項價格
        strOrder = String.valueOf(intOrder);
        txtView.setText(strOrder);
        intTotal += intOrder; //當筆總價
        strMsg1 += intCount + " 杯 = " + intPrice * intCount + "元";
        isNoS();
        isHalfS();
        isNoI();
        isHalfI();
        strMsg2 += strMsg1;
        intPrice = 0;
        intItem = 0;
        intCount = 0;
        strMsg1 = "";
        isNoS = false;
        isHalfS = false;
        isNoI = false;
        isHalfI = false;
    }

    private void drinkSelectSub(){
        //判斷所選擇【刪除】的品項類型並加總存入相關訊息
        boolean isError = false;
        switch (intItem) {
            case 1:
                intTRed -= intCount;
                if(intTRed < 0){
                    intTRed += intCount;
                    isError = true;
                    //break;
                }
                break;
            case 2:
                intTGreen -= intCount;
                if(intTGreen < 0){
                    intTGreen += intCount;
                    isError = true;
                    //break;
                }
                break;
            case 3:
                intChincha -= intCount;
                if(intChincha < 0){
                    intChincha += intCount;
                    isError = true;
                    //break;
                }
                break;
            case 4:
                intUlongcha -= intCount;
                if(intUlongcha < 0){
                    intUlongcha += intCount;
                    isError = true;
                    //break;
                }
                break;
        }

        if(isError == true){
            intItem = 0;
            intCount = 0;
            strMsg1 = "";
            builder = new AlertDialog.Builder(ActMain.this);
            builder.setTitle("＜選擇錯誤＞");
            builder.setMessage("欲刪除的杯數大於已點餐杯數！\r\n請重新選擇");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    return;
                } });
            Dialog dialog = builder.create();
            dialog.show();
            strMsg1 = "";
            isSub = false;
            return;
        }
        else {
            String strOrder = ""; //暫存顯示用
            intOrder = intPrice * intCount; //單項價格
            strOrder = String.valueOf(intOrder);
            txtView.setText(strOrder);
            intTotal -= intOrder; //當筆總價
            strMsg1 += intCount + " 杯 = " + intPrice * intCount + "元(扣除)";
            isNoS();
            isHalfS();
            isNoI();
            isHalfI();
            strOrder = String.valueOf(intOrder);
            txtView.setText("-" + strOrder);
            strMsg2 += strMsg1;
            intPrice = 0;
            isSub = false;
            intItem = 0;
            intCount = 0;
            strMsg1 = "";
            isNoS = false;
            isHalfS = false;
            isNoI = false;
            isHalfI = false;
        }
        isSub = false;
    }

    private void isNoS() {
        if(isNoS == true){
            strMsg1 += "(無糖)";
            txtView.setText("已選擇無糖");
        }
    }

    private void isHalfS() {
        if(isHalfS == true){
            strMsg1 += "(半糖)";
            txtView.setText("已選擇半糖");
        }
    }

    private void isNoI() {
        if(isNoI == true){
            strMsg1 += "(去冰)";
            txtView.setText("已選擇去冰");
        }
    }

    private void isHalfI() {
        if(isHalfI == true){
            strMsg1 += "(少冰)";
            txtView.setText("已選擇少冰");
        }
    }
    private void ini(){
        intTotal = 0; intDayTotal = 0; intOrder = 0 /*暫存每杯的總金額*/;
        intItem = 0 /*暫存選擇項目*/; intCount = 0 /*暫存輸入品項的杯數*/;
        intTRed = 0 /*紅茶總數*/; intTGreen = 0 /*綠茶總數*/;
        intChincha = 0 /*青茶總數*/; intUlongcha = 0 /*烏龍茶總數*/;
        intPrice = 0 /*品項單價*/;

        strTotal = ""; strDayTotal = ""; strOrder = "";
        strMsg1 = ""/*單筆明細-僅品名*/; strMsg2 = "" /*單筆明細-品名*數量*/;
        strMsgTotal = ""/*總明細*/;

        isSub = false; isNoS = false; isHalfS = false; isNoI = false; isHalfI = false;
        isRed = false; isGreen = false; isChincha = false; isUlongcha = false;

    }

    private void initial() {
        txtView = findViewById(R.id.txtView);
        btn01 = findViewById(R.id.btn01);
        btn01.setOnClickListener(btn01_click);
        btn02 = findViewById(R.id.btn02);
        btn02.setOnClickListener(btn02_click);
        btn03 = findViewById(R.id.btn03);
        btn03.setOnClickListener(btn03_click);
        btn04 = findViewById(R.id.btn04);
        btn04.setOnClickListener(btn04_click);
        btn05 = findViewById(R.id.btn05);
        btn05.setOnClickListener(btn05_click);
        btn06 = findViewById(R.id.btn06);
        btn06.setOnClickListener(btn06_click);
        btn07 = findViewById(R.id.btn07);
        btn07.setOnClickListener(btn07_click);
        btn08 = findViewById(R.id.btn08);
        btn08.setOnClickListener(btn08_click);
        btn09 = findViewById(R.id.btn09);
        btn09.setOnClickListener(btn09_click);
        btnRed = findViewById(R.id.btnRed);
        btnRed.setOnClickListener(btnRed_click);
        btnGreen = findViewById(R.id.btnGreen);
        btnGreen.setOnClickListener(btnGreen_click);
        btnChincha = findViewById(R.id.btnChincha);
        btnChincha.setOnClickListener(btnChincha_click);
        btnUlongcha = findViewById(R.id.btnUlongcha);
        btnUlongcha.setOnClickListener(btnUlongcha_click);
        btnTotal = findViewById(R.id.btnTotal);
        btnTotal.setOnClickListener(btnTotal_click);
        btnDayTotal = findViewById(R.id.btnDayTotal);
        btnDayTotal.setOnClickListener(btnDayTotal_click);
        btnSub = findViewById(R.id.btnSub);
        btnSub.setOnClickListener(btnSub_click);
        btnOffer = findViewById(R.id.btnOffer);
        btnOffer.setOnClickListener(btnOffer_click);
        btnNoS = findViewById(R.id.btnNoS);
        btnNoS.setOnClickListener(btnNoS_click);
        btnHalfS = findViewById(R.id.btnHalfS);
        btnHalfS.setOnClickListener(btnHalfS_click);
        btnNoI = findViewById(R.id.btnNoI);
        btnNoI.setOnClickListener(btnNoI_click);
        btnHalfI = findViewById(R.id.btnHalfI);
        btnHalfI.setOnClickListener(btnHalfI_click);
    }

    Button btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09,
           btnRed, btnGreen, btnChincha, btnUlongcha, btnTotal, btnDayTotal,
           btnSub, btnOffer, btnNoS, btnHalfS, btnNoI, btnHalfI;
    TextView txtView;

    int intTotal = 0, intDayTotal = 0, intOrder = 0 /*暫存每杯的總金額*/,
            intItem = 0 /*暫存選擇項目*/, intCount = 0 /*暫存輸入品項的杯數*/,
            intTRed = 0 /*紅茶總數*/, intTGreen = 0 /*綠茶總數*/,
            intChincha = 0 /*青茶總數*/, intUlongcha = 0 /*烏龍茶總數*/,
            intPrice = 0 /*品項單價*/;
    String strTotal = "", strDayTotal = "", strOrder = "",
            strMsg1 = ""/*單筆明細-僅品名*/, strMsg2 = "" /*單筆明細-品名*數量*/,
            strMsgTotal = ""/*總明細*/;
    boolean isSub = false, isNoS = false, isHalfS = false, isNoI = false, isHalfI = false,
            isRed = false, isGreen = false, isChincha = false, isUlongcha = false;
    AlertDialog.Builder builder;
}
