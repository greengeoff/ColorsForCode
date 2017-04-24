package com.glt.colorsforcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webView);


        String webPageString = "<div style=\"background:white; background:linear-gradient(white,gray,black);\">\n" +
                "<table  style=\"width:90%; color:white; width:80%; text-align:center; margin:0 auto;\">\n" +
                "<caption style=\"color: black;\">Web-safe colors</caption>\n" +
                "<tr>\n" +
                "<td style=\"width:16%; background: #000;\">000</td>\n" +
                "<td style=\"width:16%; background: #300;\">300</td>\n" +
                "<td style=\"width:16%; background: #600;\">600</td>\n" +
                "<td style=\"width:16%; background: #900;\">900</td>\n" +
                "<td style=\"width:16%; background: #C00;\">C00</td>\n" +
                "<td style=\"width:16%; background: #F00;\">F00</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #003;\">003</td>\n" +
                "<td style=\"background: #303;\">303</td>\n" +
                "<td style=\"background: #603;\">603</td>\n" +
                "<td style=\"background: #903;\">903</td>\n" +
                "<td style=\"background: #C03;\">C03</td>\n" +
                "<td style=\"background: #F03;\">F03</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #006;\">006</td>\n" +
                "<td style=\"background: #306;\">306</td>\n" +
                "<td style=\"background: #606;\">606</td>\n" +
                "<td style=\"background: #906;\">906</td>\n" +
                "<td style=\"background: #C06;\">C06</td>\n" +
                "<td style=\"background: #F06;\">F06</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #009;\">009</td>\n" +
                "<td style=\"background: #309;\">309</td>\n" +
                "<td style=\"background: #609;\">609</td>\n" +
                "<td style=\"background: #909;\">909</td>\n" +
                "<td style=\"background: #C09;\">C09</td>\n" +
                "<td style=\"background: #F09;\">F09</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #00C;\">00C</td>\n" +
                "<td style=\"background: #30C;\">30C</td>\n" +
                "<td style=\"background: #60C;\">60C</td>\n" +
                "<td style=\"background: #90C;\">90C</td>\n" +
                "<td style=\"background: #C0C;\">C0C</td>\n" +
                "<td style=\"background: #F0C;\">F0C</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #00F;\">00F</td>\n" +
                "<td style=\"background: #30F;\">30F</td>\n" +
                "<td style=\"background: #60F;\">60F</td>\n" +
                "<td style=\"background: #90F;\">90F</td>\n" +
                "<td style=\"background: #C0F;\">C0F</td>\n" +
                "<td style=\"background: #F0F;\">F0F</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #030;\">030</td>\n" +
                "<td style=\"background: #330;\">330</td>\n" +
                "<td style=\"background: #630;\">630</td>\n" +
                "<td style=\"background: #930;\">930</td>\n" +
                "<td style=\"background: #C30;\">C30</td>\n" +
                "<td style=\"background: #F30;\">F30</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #033;\">033</td>\n" +
                "<td style=\"background: #333;\">333</td>\n" +
                "<td style=\"background: #633;\">633</td>\n" +
                "<td style=\"background: #933;\">933</td>\n" +
                "<td style=\"background: #C33;\">C33</td>\n" +
                "<td style=\"background: #F33;\">F33</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #036;\">036</td>\n" +
                "<td style=\"background: #336;\">336</td>\n" +
                "<td style=\"background: #636;\">636</td>\n" +
                "<td style=\"background: #936;\">936</td>\n" +
                "<td style=\"background: #C36;\">C36</td>\n" +
                "<td style=\"background: #F36;\">F36</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #039;\">039</td>\n" +
                "<td style=\"background: #339;\">339</td>\n" +
                "<td style=\"background: #639;\">639</td>\n" +
                "<td style=\"background: #939;\">939</td>\n" +
                "<td style=\"background: #C39;\">C39</td>\n" +
                "<td style=\"background: #F39;\">F39</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #03C;\">03C</td>\n" +
                "<td style=\"background: #33C;\">33C</td>\n" +
                "<td style=\"background: #63C;\">63C</td>\n" +
                "<td style=\"background: #93C;\">93C</td>\n" +
                "<td style=\"background: #C3C;\">C3C</td>\n" +
                "<td style=\"background: #F3C;\">F3C</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #03F;\">03F</td>\n" +
                "<td style=\"background: #33F;\">33F</td>\n" +
                "<td style=\"background: #63F;\">63F</td>\n" +
                "<td style=\"background: #93F;\">93F</td>\n" +
                "<td style=\"background: #C3F;\">C3F</td>\n" +
                "<td style=\"background: #F3F;\">F3F</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #060;\">060</td>\n" +
                "<td style=\"background: #360;\">360</td>\n" +
                "<td style=\"background: #660;\">660</td>\n" +
                "<td style=\"background: #960;\">960</td>\n" +
                "<td style=\"background: #C60;\">C60</td>\n" +
                "<td style=\"background: #F60;\">F60</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #063;\">063</td>\n" +
                "<td style=\"background: #363;\">363</td>\n" +
                "<td style=\"background: #663;\">663</td>\n" +
                "<td style=\"background: #963;\">963</td>\n" +
                "<td style=\"background: #C63;\">C63</td>\n" +
                "<td style=\"background: #F63;\">F63</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #066;\">066</td>\n" +
                "<td style=\"background: #366;\">366</td>\n" +
                "<td style=\"background: #666;\">666</td>\n" +
                "<td style=\"background: #966;\">966</td>\n" +
                "<td style=\"background: #C66;\">C66</td>\n" +
                "<td style=\"background: #F66;\">F66</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #069;\">069</td>\n" +
                "<td style=\"background: #369;\">369</td>\n" +
                "<td style=\"background: #669;\">669</td>\n" +
                "<td style=\"background: #969;\">969</td>\n" +
                "<td style=\"background: #C69;\">C69</td>\n" +
                "<td style=\"background: #F69;\">F69</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #06C;\">06C</td>\n" +
                "<td style=\"background: #36C;\">36C</td>\n" +
                "<td style=\"background: #66C;\">66C</td>\n" +
                "<td style=\"background: #96C;\">96C</td>\n" +
                "<td style=\"background: #C6C;\">C6C</td>\n" +
                "<td style=\"background: #F6C;\">F6C</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #06F;\">06F</td>\n" +
                "<td style=\"background: #36F;\">36F</td>\n" +
                "<td style=\"background: #66F;\">66F</td>\n" +
                "<td style=\"background: #96F;\">96F</td>\n" +
                "<td style=\"background: #C6F;\">C6F</td>\n" +
                "<td style=\"background: #F6F;\">F6F</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #090;\">090</td>\n" +
                "<td style=\"background: #390;\">390</td>\n" +
                "<td style=\"background: #690;\">690</td>\n" +
                "<td style=\"background: #990;\">990</td>\n" +
                "<td style=\"background: #C90;\">C90</td>\n" +
                "<td style=\"background: #F90;\">F90</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #093;\">093</td>\n" +
                "<td style=\"background: #393;\">393</td>\n" +
                "<td style=\"background: #693;\">693</td>\n" +
                "<td style=\"background: #993;\">993</td>\n" +
                "<td style=\"background: #C93;\">C93</td>\n" +
                "<td style=\"background: #F93;\">F93</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #096;\">096</td>\n" +
                "<td style=\"background: #396;\">396</td>\n" +
                "<td style=\"background: #696;\">696</td>\n" +
                "<td style=\"background: #996;\">996</td>\n" +
                "<td style=\"background: #C96;\">C96</td>\n" +
                "<td style=\"background: #F96;\">F96</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #099;\">099</td>\n" +
                "<td style=\"background: #399;\">399</td>\n" +
                "<td style=\"background: #699;\">699</td>\n" +
                "<td style=\"background: #999;\">999</td>\n" +
                "<td style=\"background: #C99;\">C99</td>\n" +
                "<td style=\"background: #F99;\">F99</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #09C;\">09C</td>\n" +
                "<td style=\"background: #39C;\">39C</td>\n" +
                "<td style=\"background: #69C;\">69C</td>\n" +
                "<td style=\"background: #99C;\">99C</td>\n" +
                "<td style=\"background: #C9C;\">C9C</td>\n" +
                "<td style=\"background: #F9C;\">F9C</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #09F;\">09F</td>\n" +
                "<td style=\"background: #39F;\">39F</td>\n" +
                "<td style=\"background: #69F;\">69F</td>\n" +
                "<td style=\"background: #99F;\">99F</td>\n" +
                "<td style=\"background: #C9F;\">C9F</td>\n" +
                "<td style=\"background: #F9F;\">F9F</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0C0;\">0C0</td>\n" +
                "<td style=\"background: #3C0;\">3C0</td>\n" +
                "<td style=\"background: #6C0;\">6C0</td>\n" +
                "<td style=\"background: #9C0;\">9C0</td>\n" +
                "<td style=\"background: #CC0;\">CC0</td>\n" +
                "<td style=\"background: #FC0;\">FC0</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0C3;\">0C3</td>\n" +
                "<td style=\"background: #3C3;\">3C3</td>\n" +
                "<td style=\"background: #6C3;\">6C3</td>\n" +
                "<td style=\"background: #9C3;\">9C3</td>\n" +
                "<td style=\"background: #CC3;\">CC3</td>\n" +
                "<td style=\"background: #FC3;\">FC3</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0C6;\">0C6</td>\n" +
                "<td style=\"background: #3C6;\">3C6</td>\n" +
                "<td style=\"background: #6C6;\">6C6</td>\n" +
                "<td style=\"background: #9C6;\">9C6</td>\n" +
                "<td style=\"background: #CC6;\">CC6</td>\n" +
                "<td style=\"background: #FC6;\">FC6</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0C9;\">0C9</td>\n" +
                "<td style=\"background: #3C9;\">3C9</td>\n" +
                "<td style=\"background: #6C9;\">6C9</td>\n" +
                "<td style=\"background: #9C9;\">9C9</td>\n" +
                "<td style=\"background: #CC9;\">CC9</td>\n" +
                "<td style=\"background: #FC9;\">FC9</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0CC;\">0CC</td>\n" +
                "<td style=\"background: #3CC;\">3CC</td>\n" +
                "<td style=\"background: #6CC;\">6CC</td>\n" +
                "<td style=\"background: #9CC;\">9CC</td>\n" +
                "<td style=\"background: #CCC;\">CCC</td>\n" +
                "<td style=\"background: #FCC;\">FCC</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0CF;\">0CF</td>\n" +
                "<td style=\"background: #3CF;\">3CF</td>\n" +
                "<td style=\"background: #6CF;\">6CF</td>\n" +
                "<td style=\"background: #9CF;\">9CF</td>\n" +
                "<td style=\"background: #CCF;\">CCF</td>\n" +
                "<td style=\"background: #FCF;\">FCF</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0F0;\">0F0</td>\n" +
                "<td style=\"background: #3F0;\">3F0</td>\n" +
                "<td style=\"background: #6F0;\">6F0</td>\n" +
                "<td style=\"background: #9F0;\">9F0</td>\n" +
                "<td style=\"background: #CF0;\">CF0</td>\n" +
                "<td style=\"background: #FF0;\">FF0</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0F3;\">0F3</td>\n" +
                "<td style=\"background: #3F3;\">3F3</td>\n" +
                "<td style=\"background: #6F3;\">6F3</td>\n" +
                "<td style=\"background: #9F3;\">9F3</td>\n" +
                "<td style=\"background: #CF3;\">CF3</td>\n" +
                "<td style=\"background: #FF3;\">FF3</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0F6;\">0F6</td>\n" +
                "<td style=\"background: #3F6;\">3F6</td>\n" +
                "<td style=\"background: #6F6;\">6F6</td>\n" +
                "<td style=\"background: #9F6;\">9F6</td>\n" +
                "<td style=\"background: #CF6;\">CF6</td>\n" +
                "<td style=\"background: #FF6;\">FF6</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0F9;\">0F9</td>\n" +
                "<td style=\"background: #3F9;\">3F9</td>\n" +
                "<td style=\"background: #6F9;\">6F9</td>\n" +
                "<td style=\"background: #9F9;\">9F9</td>\n" +
                "<td style=\"background: #CF9;\">CF9</td>\n" +
                "<td style=\"background: #FF9;\">FF9</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0FC;\">0FC</td>\n" +
                "<td style=\"background: #3FC;\">3FC</td>\n" +
                "<td style=\"background: #6FC;\">6FC</td>\n" +
                "<td style=\"background: #9FC;\">9FC</td>\n" +
                "<td style=\"background: #CFC;\">CFC</td>\n" +
                "<td style=\"background: #FFC;\">FFC</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0FF;\">0FF</td>\n" +
                "<td style=\"background: #3FF;\">3FF</td>\n" +
                "<td style=\"background: #6FF;\">6FF</td>\n" +
                "<td style=\"background: #9FF;\">9FF</td>\n" +
                "<td style=\"background: #CFF;\">CFF</td>\n" +
                "<td style=\"background: #FFF;\">FFF</td>\n" +
                "</tr>\n" +
                "</table>" +///////////////
                "<table  style=\" background-color:gray; width:90%; color:white; width:80%; text-align:center; margin:0 auto;\">\n" +
                "<tr>\n" +
                "<td style=\"width:16%; background: #000;\">000</td>\n" +
                "<td style=\"width:16%; background: #300;\">300</td>\n" +
                "<td style=\"width:16%; background: #600;\">600</td>\n" +
                "<td style=\"width:16%; background: #900;\">900</td>\n" +
                "<td style=\"width:16%; background: #C00;\">C00</td>\n" +
                "<td style=\"width:16%; background: #F00;\">F00</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #003;\">003</td>\n" +
                "<td style=\"background: #303;\">303</td>\n" +
                "<td style=\"background: #603;\">603</td>\n" +
                "<td style=\"background: #903;\">903</td>\n" +
                "<td style=\"background: #C03;\">C03</td>\n" +
                "<td style=\"background: #F03;\">F03</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #006;\">006</td>\n" +
                "<td style=\"background: #306;\">306</td>\n" +
                "<td style=\"background: #606;\">606</td>\n" +
                "<td style=\"background: #906;\">906</td>\n" +
                "<td style=\"background: #C06;\">C06</td>\n" +
                "<td style=\"background: #F06;\">F06</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #009;\">009</td>\n" +
                "<td style=\"background: #309;\">309</td>\n" +
                "<td style=\"background: #609;\">609</td>\n" +
                "<td style=\"background: #909;\">909</td>\n" +
                "<td style=\"background: #C09;\">C09</td>\n" +
                "<td style=\"background: #F09;\">F09</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #00C;\">00C</td>\n" +
                "<td style=\"background: #30C;\">30C</td>\n" +
                "<td style=\"background: #60C;\">60C</td>\n" +
                "<td style=\"background: #90C;\">90C</td>\n" +
                "<td style=\"background: #C0C;\">C0C</td>\n" +
                "<td style=\"background: #F0C;\">F0C</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #00F;\">00F</td>\n" +
                "<td style=\"background: #30F;\">30F</td>\n" +
                "<td style=\"background: #60F;\">60F</td>\n" +
                "<td style=\"background: #90F;\">90F</td>\n" +
                "<td style=\"background: #C0F;\">C0F</td>\n" +
                "<td style=\"background: #F0F;\">F0F</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #030;\">030</td>\n" +
                "<td style=\"background: #330;\">330</td>\n" +
                "<td style=\"background: #630;\">630</td>\n" +
                "<td style=\"background: #930;\">930</td>\n" +
                "<td style=\"background: #C30;\">C30</td>\n" +
                "<td style=\"background: #F30;\">F30</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #033;\">033</td>\n" +
                "<td style=\"background: #333;\">333</td>\n" +
                "<td style=\"background: #633;\">633</td>\n" +
                "<td style=\"background: #933;\">933</td>\n" +
                "<td style=\"background: #C33;\">C33</td>\n" +
                "<td style=\"background: #F33;\">F33</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #036;\">036</td>\n" +
                "<td style=\"background: #336;\">336</td>\n" +
                "<td style=\"background: #636;\">636</td>\n" +
                "<td style=\"background: #936;\">936</td>\n" +
                "<td style=\"background: #C36;\">C36</td>\n" +
                "<td style=\"background: #F36;\">F36</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #039;\">039</td>\n" +
                "<td style=\"background: #339;\">339</td>\n" +
                "<td style=\"background: #639;\">639</td>\n" +
                "<td style=\"background: #939;\">939</td>\n" +
                "<td style=\"background: #C39;\">C39</td>\n" +
                "<td style=\"background: #F39;\">F39</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #03C;\">03C</td>\n" +
                "<td style=\"background: #33C;\">33C</td>\n" +
                "<td style=\"background: #63C;\">63C</td>\n" +
                "<td style=\"background: #93C;\">93C</td>\n" +
                "<td style=\"background: #C3C;\">C3C</td>\n" +
                "<td style=\"background: #F3C;\">F3C</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #03F;\">03F</td>\n" +
                "<td style=\"background: #33F;\">33F</td>\n" +
                "<td style=\"background: #63F;\">63F</td>\n" +
                "<td style=\"background: #93F;\">93F</td>\n" +
                "<td style=\"background: #C3F;\">C3F</td>\n" +
                "<td style=\"background: #F3F;\">F3F</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #060;\">060</td>\n" +
                "<td style=\"background: #360;\">360</td>\n" +
                "<td style=\"background: #660;\">660</td>\n" +
                "<td style=\"background: #960;\">960</td>\n" +
                "<td style=\"background: #C60;\">C60</td>\n" +
                "<td style=\"background: #F60;\">F60</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #063;\">063</td>\n" +
                "<td style=\"background: #363;\">363</td>\n" +
                "<td style=\"background: #663;\">663</td>\n" +
                "<td style=\"background: #963;\">963</td>\n" +
                "<td style=\"background: #C63;\">C63</td>\n" +
                "<td style=\"background: #F63;\">F63</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #066;\">066</td>\n" +
                "<td style=\"background: #366;\">366</td>\n" +
                "<td style=\"background: #666;\">666</td>\n" +
                "<td style=\"background: #966;\">966</td>\n" +
                "<td style=\"background: #C66;\">C66</td>\n" +
                "<td style=\"background: #F66;\">F66</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #069;\">069</td>\n" +
                "<td style=\"background: #369;\">369</td>\n" +
                "<td style=\"background: #669;\">669</td>\n" +
                "<td style=\"background: #969;\">969</td>\n" +
                "<td style=\"background: #C69;\">C69</td>\n" +
                "<td style=\"background: #F69;\">F69</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #06C;\">06C</td>\n" +
                "<td style=\"background: #36C;\">36C</td>\n" +
                "<td style=\"background: #66C;\">66C</td>\n" +
                "<td style=\"background: #96C;\">96C</td>\n" +
                "<td style=\"background: #C6C;\">C6C</td>\n" +
                "<td style=\"background: #F6C;\">F6C</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #06F;\">06F</td>\n" +
                "<td style=\"background: #36F;\">36F</td>\n" +
                "<td style=\"background: #66F;\">66F</td>\n" +
                "<td style=\"background: #96F;\">96F</td>\n" +
                "<td style=\"background: #C6F;\">C6F</td>\n" +
                "<td style=\"background: #F6F;\">F6F</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #090;\">090</td>\n" +
                "<td style=\"background: #390;\">390</td>\n" +
                "<td style=\"background: #690;\">690</td>\n" +
                "<td style=\"background: #990;\">990</td>\n" +
                "<td style=\"background: #C90;\">C90</td>\n" +
                "<td style=\"background: #F90;\">F90</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #093;\">093</td>\n" +
                "<td style=\"background: #393;\">393</td>\n" +
                "<td style=\"background: #693;\">693</td>\n" +
                "<td style=\"background: #993;\">993</td>\n" +
                "<td style=\"background: #C93;\">C93</td>\n" +
                "<td style=\"background: #F93;\">F93</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #096;\">096</td>\n" +
                "<td style=\"background: #396;\">396</td>\n" +
                "<td style=\"background: #696;\">696</td>\n" +
                "<td style=\"background: #996;\">996</td>\n" +
                "<td style=\"background: #C96;\">C96</td>\n" +
                "<td style=\"background: #F96;\">F96</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #099;\">099</td>\n" +
                "<td style=\"background: #399;\">399</td>\n" +
                "<td style=\"background: #699;\">699</td>\n" +
                "<td style=\"background: #999;\">999</td>\n" +
                "<td style=\"background: #C99;\">C99</td>\n" +
                "<td style=\"background: #F99;\">F99</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #09C;\">09C</td>\n" +
                "<td style=\"background: #39C;\">39C</td>\n" +
                "<td style=\"background: #69C;\">69C</td>\n" +
                "<td style=\"background: #99C;\">99C</td>\n" +
                "<td style=\"background: #C9C;\">C9C</td>\n" +
                "<td style=\"background: #F9C;\">F9C</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #09F;\">09F</td>\n" +
                "<td style=\"background: #39F;\">39F</td>\n" +
                "<td style=\"background: #69F;\">69F</td>\n" +
                "<td style=\"background: #99F;\">99F</td>\n" +
                "<td style=\"background: #C9F;\">C9F</td>\n" +
                "<td style=\"background: #F9F;\">F9F</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0C0;\">0C0</td>\n" +
                "<td style=\"background: #3C0;\">3C0</td>\n" +
                "<td style=\"background: #6C0;\">6C0</td>\n" +
                "<td style=\"background: #9C0;\">9C0</td>\n" +
                "<td style=\"background: #CC0;\">CC0</td>\n" +
                "<td style=\"background: #FC0;\">FC0</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0C3;\">0C3</td>\n" +
                "<td style=\"background: #3C3;\">3C3</td>\n" +
                "<td style=\"background: #6C3;\">6C3</td>\n" +
                "<td style=\"background: #9C3;\">9C3</td>\n" +
                "<td style=\"background: #CC3;\">CC3</td>\n" +
                "<td style=\"background: #FC3;\">FC3</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0C6;\">0C6</td>\n" +
                "<td style=\"background: #3C6;\">3C6</td>\n" +
                "<td style=\"background: #6C6;\">6C6</td>\n" +
                "<td style=\"background: #9C6;\">9C6</td>\n" +
                "<td style=\"background: #CC6;\">CC6</td>\n" +
                "<td style=\"background: #FC6;\">FC6</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0C9;\">0C9</td>\n" +
                "<td style=\"background: #3C9;\">3C9</td>\n" +
                "<td style=\"background: #6C9;\">6C9</td>\n" +
                "<td style=\"background: #9C9;\">9C9</td>\n" +
                "<td style=\"background: #CC9;\">CC9</td>\n" +
                "<td style=\"background: #FC9;\">FC9</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0CC;\">0CC</td>\n" +
                "<td style=\"background: #3CC;\">3CC</td>\n" +
                "<td style=\"background: #6CC;\">6CC</td>\n" +
                "<td style=\"background: #9CC;\">9CC</td>\n" +
                "<td style=\"background: #CCC;\">CCC</td>\n" +
                "<td style=\"background: #FCC;\">FCC</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0CF;\">0CF</td>\n" +
                "<td style=\"background: #3CF;\">3CF</td>\n" +
                "<td style=\"background: #6CF;\">6CF</td>\n" +
                "<td style=\"background: #9CF;\">9CF</td>\n" +
                "<td style=\"background: #CCF;\">CCF</td>\n" +
                "<td style=\"background: #FCF;\">FCF</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0F0;\">0F0</td>\n" +
                "<td style=\"background: #3F0;\">3F0</td>\n" +
                "<td style=\"background: #6F0;\">6F0</td>\n" +
                "<td style=\"background: #9F0;\">9F0</td>\n" +
                "<td style=\"background: #CF0;\">CF0</td>\n" +
                "<td style=\"background: #FF0;\">FF0</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0F3;\">0F3</td>\n" +
                "<td style=\"background: #3F3;\">3F3</td>\n" +
                "<td style=\"background: #6F3;\">6F3</td>\n" +
                "<td style=\"background: #9F3;\">9F3</td>\n" +
                "<td style=\"background: #CF3;\">CF3</td>\n" +
                "<td style=\"background: #FF3;\">FF3</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0F6;\">0F6</td>\n" +
                "<td style=\"background: #3F6;\">3F6</td>\n" +
                "<td style=\"background: #6F6;\">6F6</td>\n" +
                "<td style=\"background: #9F6;\">9F6</td>\n" +
                "<td style=\"background: #CF6;\">CF6</td>\n" +
                "<td style=\"background: #FF6;\">FF6</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0F9;\">0F9</td>\n" +
                "<td style=\"background: #3F9;\">3F9</td>\n" +
                "<td style=\"background: #6F9;\">6F9</td>\n" +
                "<td style=\"background: #9F9;\">9F9</td>\n" +
                "<td style=\"background: #CF9;\">CF9</td>\n" +
                "<td style=\"background: #FF9;\">FF9</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0FC;\">0FC</td>\n" +
                "<td style=\"background: #3FC;\">3FC</td>\n" +
                "<td style=\"background: #6FC;\">6FC</td>\n" +
                "<td style=\"background: #9FC;\">9FC</td>\n" +
                "<td style=\"background: #CFC;\">CFC</td>\n" +
                "<td style=\"background: #FFC;\">FFC</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0FF;\">0FF</td>\n" +
                "<td style=\"background: #3FF;\">3FF</td>\n" +
                "<td style=\"background: #6FF;\">6FF</td>\n" +
                "<td style=\"background: #9FF;\">9FF</td>\n" +
                "<td style=\"background: #CFF;\">CFF</td>\n" +
                "<td style=\"background: #FFF;\">FFF</td>\n" +
                "</tr>\n" +
                "</table>" +
                "<table  style=\" background-color:black; width:90%; color:white; width:80%; text-align:center; margin:0 auto;\">\n" +
                "<tr>\n" +
                "<td style=\"width:16%; background: #000;\">000</td>\n" +
                "<td style=\"width:16%; background: #300;\">300</td>\n" +
                "<td style=\"width:16%; background: #600;\">600</td>\n" +
                "<td style=\"width:16%; background: #900;\">900</td>\n" +
                "<td style=\"width:16%; background: #C00;\">C00</td>\n" +
                "<td style=\"width:16%; background: #F00;\">F00</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #003;\">003</td>\n" +
                "<td style=\"background: #303;\">303</td>\n" +
                "<td style=\"background: #603;\">603</td>\n" +
                "<td style=\"background: #903;\">903</td>\n" +
                "<td style=\"background: #C03;\">C03</td>\n" +
                "<td style=\"background: #F03;\">F03</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #006;\">006</td>\n" +
                "<td style=\"background: #306;\">306</td>\n" +
                "<td style=\"background: #606;\">606</td>\n" +
                "<td style=\"background: #906;\">906</td>\n" +
                "<td style=\"background: #C06;\">C06</td>\n" +
                "<td style=\"background: #F06;\">F06</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #009;\">009</td>\n" +
                "<td style=\"background: #309;\">309</td>\n" +
                "<td style=\"background: #609;\">609</td>\n" +
                "<td style=\"background: #909;\">909</td>\n" +
                "<td style=\"background: #C09;\">C09</td>\n" +
                "<td style=\"background: #F09;\">F09</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #00C;\">00C</td>\n" +
                "<td style=\"background: #30C;\">30C</td>\n" +
                "<td style=\"background: #60C;\">60C</td>\n" +
                "<td style=\"background: #90C;\">90C</td>\n" +
                "<td style=\"background: #C0C;\">C0C</td>\n" +
                "<td style=\"background: #F0C;\">F0C</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #00F;\">00F</td>\n" +
                "<td style=\"background: #30F;\">30F</td>\n" +
                "<td style=\"background: #60F;\">60F</td>\n" +
                "<td style=\"background: #90F;\">90F</td>\n" +
                "<td style=\"background: #C0F;\">C0F</td>\n" +
                "<td style=\"background: #F0F;\">F0F</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #030;\">030</td>\n" +
                "<td style=\"background: #330;\">330</td>\n" +
                "<td style=\"background: #630;\">630</td>\n" +
                "<td style=\"background: #930;\">930</td>\n" +
                "<td style=\"background: #C30;\">C30</td>\n" +
                "<td style=\"background: #F30;\">F30</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #033;\">033</td>\n" +
                "<td style=\"background: #333;\">333</td>\n" +
                "<td style=\"background: #633;\">633</td>\n" +
                "<td style=\"background: #933;\">933</td>\n" +
                "<td style=\"background: #C33;\">C33</td>\n" +
                "<td style=\"background: #F33;\">F33</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #036;\">036</td>\n" +
                "<td style=\"background: #336;\">336</td>\n" +
                "<td style=\"background: #636;\">636</td>\n" +
                "<td style=\"background: #936;\">936</td>\n" +
                "<td style=\"background: #C36;\">C36</td>\n" +
                "<td style=\"background: #F36;\">F36</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #039;\">039</td>\n" +
                "<td style=\"background: #339;\">339</td>\n" +
                "<td style=\"background: #639;\">639</td>\n" +
                "<td style=\"background: #939;\">939</td>\n" +
                "<td style=\"background: #C39;\">C39</td>\n" +
                "<td style=\"background: #F39;\">F39</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #03C;\">03C</td>\n" +
                "<td style=\"background: #33C;\">33C</td>\n" +
                "<td style=\"background: #63C;\">63C</td>\n" +
                "<td style=\"background: #93C;\">93C</td>\n" +
                "<td style=\"background: #C3C;\">C3C</td>\n" +
                "<td style=\"background: #F3C;\">F3C</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #03F;\">03F</td>\n" +
                "<td style=\"background: #33F;\">33F</td>\n" +
                "<td style=\"background: #63F;\">63F</td>\n" +
                "<td style=\"background: #93F;\">93F</td>\n" +
                "<td style=\"background: #C3F;\">C3F</td>\n" +
                "<td style=\"background: #F3F;\">F3F</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #060;\">060</td>\n" +
                "<td style=\"background: #360;\">360</td>\n" +
                "<td style=\"background: #660;\">660</td>\n" +
                "<td style=\"background: #960;\">960</td>\n" +
                "<td style=\"background: #C60;\">C60</td>\n" +
                "<td style=\"background: #F60;\">F60</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #063;\">063</td>\n" +
                "<td style=\"background: #363;\">363</td>\n" +
                "<td style=\"background: #663;\">663</td>\n" +
                "<td style=\"background: #963;\">963</td>\n" +
                "<td style=\"background: #C63;\">C63</td>\n" +
                "<td style=\"background: #F63;\">F63</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #066;\">066</td>\n" +
                "<td style=\"background: #366;\">366</td>\n" +
                "<td style=\"background: #666;\">666</td>\n" +
                "<td style=\"background: #966;\">966</td>\n" +
                "<td style=\"background: #C66;\">C66</td>\n" +
                "<td style=\"background: #F66;\">F66</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #069;\">069</td>\n" +
                "<td style=\"background: #369;\">369</td>\n" +
                "<td style=\"background: #669;\">669</td>\n" +
                "<td style=\"background: #969;\">969</td>\n" +
                "<td style=\"background: #C69;\">C69</td>\n" +
                "<td style=\"background: #F69;\">F69</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #06C;\">06C</td>\n" +
                "<td style=\"background: #36C;\">36C</td>\n" +
                "<td style=\"background: #66C;\">66C</td>\n" +
                "<td style=\"background: #96C;\">96C</td>\n" +
                "<td style=\"background: #C6C;\">C6C</td>\n" +
                "<td style=\"background: #F6C;\">F6C</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"background: #06F;\">06F</td>\n" +
                "<td style=\"background: #36F;\">36F</td>\n" +
                "<td style=\"background: #66F;\">66F</td>\n" +
                "<td style=\"background: #96F;\">96F</td>\n" +
                "<td style=\"background: #C6F;\">C6F</td>\n" +
                "<td style=\"background: #F6F;\">F6F</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #090;\">090</td>\n" +
                "<td style=\"background: #390;\">390</td>\n" +
                "<td style=\"background: #690;\">690</td>\n" +
                "<td style=\"background: #990;\">990</td>\n" +
                "<td style=\"background: #C90;\">C90</td>\n" +
                "<td style=\"background: #F90;\">F90</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #093;\">093</td>\n" +
                "<td style=\"background: #393;\">393</td>\n" +
                "<td style=\"background: #693;\">693</td>\n" +
                "<td style=\"background: #993;\">993</td>\n" +
                "<td style=\"background: #C93;\">C93</td>\n" +
                "<td style=\"background: #F93;\">F93</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #096;\">096</td>\n" +
                "<td style=\"background: #396;\">396</td>\n" +
                "<td style=\"background: #696;\">696</td>\n" +
                "<td style=\"background: #996;\">996</td>\n" +
                "<td style=\"background: #C96;\">C96</td>\n" +
                "<td style=\"background: #F96;\">F96</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #099;\">099</td>\n" +
                "<td style=\"background: #399;\">399</td>\n" +
                "<td style=\"background: #699;\">699</td>\n" +
                "<td style=\"background: #999;\">999</td>\n" +
                "<td style=\"background: #C99;\">C99</td>\n" +
                "<td style=\"background: #F99;\">F99</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #09C;\">09C</td>\n" +
                "<td style=\"background: #39C;\">39C</td>\n" +
                "<td style=\"background: #69C;\">69C</td>\n" +
                "<td style=\"background: #99C;\">99C</td>\n" +
                "<td style=\"background: #C9C;\">C9C</td>\n" +
                "<td style=\"background: #F9C;\">F9C</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #09F;\">09F</td>\n" +
                "<td style=\"background: #39F;\">39F</td>\n" +
                "<td style=\"background: #69F;\">69F</td>\n" +
                "<td style=\"background: #99F;\">99F</td>\n" +
                "<td style=\"background: #C9F;\">C9F</td>\n" +
                "<td style=\"background: #F9F;\">F9F</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0C0;\">0C0</td>\n" +
                "<td style=\"background: #3C0;\">3C0</td>\n" +
                "<td style=\"background: #6C0;\">6C0</td>\n" +
                "<td style=\"background: #9C0;\">9C0</td>\n" +
                "<td style=\"background: #CC0;\">CC0</td>\n" +
                "<td style=\"background: #FC0;\">FC0</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0C3;\">0C3</td>\n" +
                "<td style=\"background: #3C3;\">3C3</td>\n" +
                "<td style=\"background: #6C3;\">6C3</td>\n" +
                "<td style=\"background: #9C3;\">9C3</td>\n" +
                "<td style=\"background: #CC3;\">CC3</td>\n" +
                "<td style=\"background: #FC3;\">FC3</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0C6;\">0C6</td>\n" +
                "<td style=\"background: #3C6;\">3C6</td>\n" +
                "<td style=\"background: #6C6;\">6C6</td>\n" +
                "<td style=\"background: #9C6;\">9C6</td>\n" +
                "<td style=\"background: #CC6;\">CC6</td>\n" +
                "<td style=\"background: #FC6;\">FC6</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0C9;\">0C9</td>\n" +
                "<td style=\"background: #3C9;\">3C9</td>\n" +
                "<td style=\"background: #6C9;\">6C9</td>\n" +
                "<td style=\"background: #9C9;\">9C9</td>\n" +
                "<td style=\"background: #CC9;\">CC9</td>\n" +
                "<td style=\"background: #FC9;\">FC9</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0CC;\">0CC</td>\n" +
                "<td style=\"background: #3CC;\">3CC</td>\n" +
                "<td style=\"background: #6CC;\">6CC</td>\n" +
                "<td style=\"background: #9CC;\">9CC</td>\n" +
                "<td style=\"background: #CCC;\">CCC</td>\n" +
                "<td style=\"background: #FCC;\">FCC</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0CF;\">0CF</td>\n" +
                "<td style=\"background: #3CF;\">3CF</td>\n" +
                "<td style=\"background: #6CF;\">6CF</td>\n" +
                "<td style=\"background: #9CF;\">9CF</td>\n" +
                "<td style=\"background: #CCF;\">CCF</td>\n" +
                "<td style=\"background: #FCF;\">FCF</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0F0;\">0F0</td>\n" +
                "<td style=\"background: #3F0;\">3F0</td>\n" +
                "<td style=\"background: #6F0;\">6F0</td>\n" +
                "<td style=\"background: #9F0;\">9F0</td>\n" +
                "<td style=\"background: #CF0;\">CF0</td>\n" +
                "<td style=\"background: #FF0;\">FF0</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0F3;\">0F3</td>\n" +
                "<td style=\"background: #3F3;\">3F3</td>\n" +
                "<td style=\"background: #6F3;\">6F3</td>\n" +
                "<td style=\"background: #9F3;\">9F3</td>\n" +
                "<td style=\"background: #CF3;\">CF3</td>\n" +
                "<td style=\"background: #FF3;\">FF3</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0F6;\">0F6</td>\n" +
                "<td style=\"background: #3F6;\">3F6</td>\n" +
                "<td style=\"background: #6F6;\">6F6</td>\n" +
                "<td style=\"background: #9F6;\">9F6</td>\n" +
                "<td style=\"background: #CF6;\">CF6</td>\n" +
                "<td style=\"background: #FF6;\">FF6</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0F9;\">0F9</td>\n" +
                "<td style=\"background: #3F9;\">3F9</td>\n" +
                "<td style=\"background: #6F9;\">6F9</td>\n" +
                "<td style=\"background: #9F9;\">9F9</td>\n" +
                "<td style=\"background: #CF9;\">CF9</td>\n" +
                "<td style=\"background: #FF9;\">FF9</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0FC;\">0FC</td>\n" +
                "<td style=\"background: #3FC;\">3FC</td>\n" +
                "<td style=\"background: #6FC;\">6FC</td>\n" +
                "<td style=\"background: #9FC;\">9FC</td>\n" +
                "<td style=\"background: #CFC;\">CFC</td>\n" +
                "<td style=\"background: #FFC;\">FFC</td>\n" +
                "</tr>\n" +
                "<tr style=\"color: black;\">\n" +
                "<td style=\"background: #0FF;\">0FF</td>\n" +
                "<td style=\"background: #3FF;\">3FF</td>\n" +
                "<td style=\"background: #6FF;\">6FF</td>\n" +
                "<td style=\"background: #9FF;\">9FF</td>\n" +
                "<td style=\"background: #CFF;\">CFF</td>\n" +
                "<td style=\"background: #FFF;\">FFF</td>\n" +
                "</tr>\n" +
                "</table></div>"
                ;

        webView.loadData(webPageString,"text/html",null);


    }
}
