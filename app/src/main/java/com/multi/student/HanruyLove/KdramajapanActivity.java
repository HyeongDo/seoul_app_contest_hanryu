package com.multi.student.HanruyLove;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.multi.student.HanruyLove.AddAdapter.newname;


public class KdramajapanActivity extends AppCompatActivity {
    ListView clist;
    ArrayList<Productadd> plist;
    AddAdapter adapter;
    SQLiteDatabase db;
    TextView name;
    int draw1,draw2,draw3;


    @Override
    protected void onStart() {
        super.onStart();
        createDB();
        createTable();
        insertData();
        selectData();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmain);

        clist = (ListView)findViewById(R.id.clist);
        plist = new ArrayList<>();

        adapter = new AddAdapter(this, R.layout.additemlist,plist);
        clist.setAdapter(adapter);
        Intent i = getIntent();
        newname = i.getStringExtra("name");
        name = (TextView) findViewById(R.id.name);
        name.setText(i.getStringExtra("listname"));
        clist.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(
                        getApplicationContext(), // 현재화면의 제어권자
                        AboutActivity.class); // 다음넘어갈 화면


                intent.putExtra("name", plist.get(position).getName());


                startActivity(intent);
            }
        });

    }

    public void createDB() {
        db = openOrCreateDatabase
                ("member.db", Context.MODE_PRIVATE, null);
    }

    public void createTable() {
        String q;
        q= "drop table if exists hwayugi2 ";
        db.execSQL(q);
        q= "drop table if exists dangzamsa2 ";
        db.execSQL(q);
        q= "drop table if exists sarang2";
        db.execSQL(q);
        q= "drop table if exists ssam2 ";
        db.execSQL(q);
        q= "drop table if exists doctors2";
        db.execSQL(q);
        q= "drop table if exists doggabi2";
        db.execSQL(q);
        q= "drop table if exists ddoohaeyoung2";
        db.execSQL(q);
        q= "drop table if exists bulgudae2";
        db.execSQL(q);
        q= "drop table if exists taeyang2";
        db.execSQL(q);
        q= "drop table if exists oungpal2";
        db.execSQL(q);
        q = "create table if not exists hwayugi2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists dangzamsa2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists sarang2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists ssam2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists doctors2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists doggabi2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists ddoohaeyoung2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists bulgudae2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists taeyang2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);
        q = "create table if not exists oungpal2(num,_name primary key, about,address,tel,addresstext)";
        db.execSQL(q);


        Log.i("sqlite::::::::", "table creation success" +
                "");
    }


    public void insertData() {

        String q;
        q= "insert into hwayugi2 values('1','文化備蓄基地','石油ショック以来、石油を保持するために、5つの油類タンクに建てられた麻浦石油備蓄基地は、2002年ワールドカップを控えて安全上の理由から、閉鎖されたが、2017年9月、市民のための文化複合施設「文化備蓄基地」として新たに生まれた。既存の石油タンクを再利用して、市民のための会場と教室、展示館、カフェテリア、多目的講義室などに変貌した。 <化有機>の中天界のメッセンジャー須菩提調査のアジトに出てきたのは、「T1パビリオン」である。タンク解体後に残ったコンクリート擁壁の中のガラスに壁と屋根を新しく作成過去の擁壁と現在の建築物、メボンサンの岩盤地形が調和広がる様子を見ることができる場所に文化備蓄基地内の他の空間のような多目的通信領域として活用されている。 T1パビリオンのほか、T2、T3、T4、T5、T6、T0までそれぞれ様々な目的や用途を持って運営されており、時間割いてツアーによい。 ','ソウル特別市麻浦区増産に87','02-376-6410','https://parks.seoul.go.kr/template/sub/culturetank.do')";
        db.execSQL(q);
        q= "insert into hwayugi2 values('2','ウォーカーバウト','\n" +
                "旅行、猫、タイ料理、手作りビールなどのキーワードをすべて集めたのが「トラベルパブ」ウォーカーバーウトイダ。妖怪にいじめられる三蔵を孫悟空（イ・スンギ）が求めてくれるシーンで出てきたところである。 2016年の旅行ガイドロンリープラネットに紹介され南山近くを訪問する全世界の旅行者のアジトで有名になった。風味が特別な有名手作りビール、タイ地元にも認められたパッタイ、トᆷヤンクンなどが主なメニューだ。全世界の通貨を収集して置くと、多くの訪問者ポラロイド写真でぎっしりだ。ウォーカーバウトの向かいに位置崇義女子大学附属書から4号線明洞駅3番出口まで続く道の近くには漫画の街として有名な「楽しみのために」があり、様々な見どころがあります。','ソウル特別市中区退渓路20道49','02-757-1110','https://www.instagram.com/pub_walkabout/')";
        db.execSQL(q);
        q= "insert into hwayugi2 values('3','エメクエンボルリオス梨泰院店\n','<化有機> 1回で孫悟空（イ・スンギ）が冬将軍のアイスクリーム店に客がない心配をする場面があった。しかし、現実のエメクエンボルリオスはそのような心配は必要ないほどの人気だ。新鮮な牛乳をベースにマンゴーの王様と呼ばれるインドのアルフォンソマンゴーと各種旬の果物を最大22％含有したエメクエンボルリオスアイスクリームは、マダガスカル産バニラ空、手作りチョコレートなど最高級の材料を使用し、コーシャ認証など、安全な生産方式で、米国ボストン、ニューヨークなど、現地でのベストアイスクリームに選ばれている。 40以上の味のアイスクリームにフルーツリング、チョコレート、レインボースプリンクラーなど派手なトッピングをのせた手作りワプルコンは、様々なSNS上で公開されて多くの人気を集めている。','ソウル特別市龍山区梨泰院で16道10','02-797-0814','http://emackandbolios.kr/')";
        db.execSQL(q);
        q= "insert into hwayugi2 values('4','イテウォンアンティークストーリー','\n" +
                "イテウォン家具圏内位置アンティークストーリーはアンティーク、ヴィンテージ小物とレトロ家具をレンタル、販売しているところである。 <化有機>で孫悟空（イ・スンギ）は、店で最も高いというやかんを購入するために沙悟浄に電話をかけなければならいた。何百万ウォンもするレトロ家具から歌声非良い小物まで様々な製品が備えられている。各種撮影用小物や、インテリア用什器を用意しようとする人には宝物庫のような存在。梨泰院1洞住民センター上がる道のすぐ隣に位置しています。','ソウル特別市龍山区普光で104','02-733-2979','')";
        db.execSQL(q);




        q= "insert into dangzamsa2 values('5','ボトゥフラワー','安国駅1番出口尹ボ善道に沿って北村韓屋村に上がってみる遠くからも目立つ花屋が見える。ホンジュ（樹脂）があいさつしたまさにその花屋ある。様々な花が販売されており、長い間美しさを楽しむことができるドライフラワーやプリザーブドフラワーが観光客に人気だ。短い時間の間のフラワーレッスン（日本語可）も可能である。','ソウル特別市鍾路区尹ボ善道28',' 02-737-8934','http://www.botteflower.com/')";
        db.execSQL(q);
        q= "insert into dangzamsa2 values('6','パステル出入りタ安国店','ボトゥフラワー向かいにあるエッグタルト専門店。ホンジュ（樹脂）とジェチャン（イ・ジョンソク）はよだれを飲んウィンドウ越しに眺めて足を移したが、あなたはその必要がない。バサクハムとしっとりとした柔らかさが共存する様々な味のエッグタルトとアメリカーノ一杯であれば、午後の活力に十分である。すでに<相続人>など、複数のドラマの撮影場所として活用されたことが多いところである。','ソウル特別市鍾路区尹ボ善道31','02-733-2979','')";
        db.execSQL(q);
        q= "insert into dangzamsa2 values('7','We are young壁画','\n" +
                "安国駅1番出口から風評女子高を挟んで精読図書館に向かっていく道、徳性女子高と徳性女子をつなぐ陸橋の下壁に描かれた壁画である。キスする老夫婦の図のwe are youngというフレーズが印象的な壁画で北村韓屋村を行き来する多くの観光客の愛を受けている。時間差をおいてホンジュ（樹脂）とヘチャン（イ・ジョンソク）が並んで立っていたまさにそこだ。','ソウル特別市鍾路区ユルゴクロ3道64','02-2148-1114','')";
        db.execSQL(q);
        q= "insert into dangzamsa2 values('8','カフェパンプキン','\n" +
                "世宗路裏側、朝鮮日報情動別館渡る位置カフェで、テラスが特に素晴らしいところである。 <あなたが寝ている間に>はホンジュ（樹脂）とイユボム（イ・サンヨプ）が雨の日に会っ古城が行き交っ場面が演出されたところだが、劇中の雰囲気とは違って平和居心地の良い雰囲気を誇る。太陽の良い日に大きく扉が開かれたテラスに向かって置かれたソファは、カフェトップ穴場スポット。サツマイモラテと同様に蜂蜜カボチャに味をつけた蜂蜜カボチャラテとココナッツクリームやゼリーが入ったパンプキンココスムージーが春オススメメニュー。パンプキンパイなどのデザートメニューも備えている。','ソウル特別市中区世宗路21道40','02-733-7905','https://www.instagram.com/cafepump_kin/')";
        db.execSQL(q);





        q= "insert into sarang2 values('9','グラ体や','延南洞に位置グラ体私「愛の温度>で上等フランス留学後に戻ってくる構えたレストラン「グッドスープ」に登場するところである。メニューがとても多様で、最も人気のあるメニューは、手作りビールとピザ。シェフのおすすめメニューは、インドカレーで、ワインと意外によく合っているという点がユニークである。夕方には、ほのかな照明とロマンチックな雰囲気の中にワインとステーキを楽しむことができる。テーブル間のスペースが広く、食事中対話する方であり、あちこちに配置された可愛らしい小物が居心地の良い雰囲気を演出する。','ソウル麻浦区ヨンナム13 1階','02-338-8908','')";
        db.execSQL(q);
        q= "insert into sarang2 values('10','ヤンチュルクッキング','「愛の温度>に登場するイケメンシェフが撮影前シェフのクッキングクラスを受講したところである。いい量（良）、噴出出（出）。良い食べ物を出して置くという意味のヤンチュルは、日本で料理を勉強した、ここシェフの名前でもある。旬の食材を活用した健康で強固なフュージョン韓国料理食をドレスするところ。常に新しいメニューの開発に努め、調味料を使わない、丁寧いっぱい食堂だ。','ソウル江南区ノンヒョンに157の道15','02-547-4420','')";
        db.execSQL(q);
        q= "insert into sarang2 values('11','ワイスパチオ','フランスの留学前から料理の腕が優れていた上等。彼がした食べ物を味わったジョンウは半してしまう。劇中ジョンウが初めて上等の料理を経験した場所として登場したのは、ノンヒョンドンに位置イタリックアンレストランワイスパチください。暖かいスープからアンティパスト、ピメント、メイン料理、デザートに至るまでのワイスパチオの食事は十分に美しい。ランチには、合理的な価格の3つのコースが用意されている。夕食の場合、メイン料理のステーキとサーロインステーキロース、雪歳、ラム料理のいずれかを選択することができる。プレーティングも繊細で、視覚と味覚の両方満足のいく食事を提供する。空間も魅力的だが、ロマンチックなデートをしたい場合は窓側の席をお勧めします。','ソウル江南区オンジュで133道21','02-549-5667','https://www.yspazioseoul.com/')";
        db.execSQL(q);
        q= "insert into sarang2 values('12','クチ切りあたり','ドラマの中で拒絶遭っホン（チョ・ボア）は、心が痛みますが、そのシーンの中のテラスだけは本当に美しかった。ここはまさにイテウォンのフレンチレストランクチ切り党である。シェフを含むスタッフのほとんどがフランス人であり、レストランの内部も、フランスの夏のカフェに似てワインが自然に思い出す雰囲気だ。おすすめメニューはサーモンステーキ。適当酸味でさっぱりした味に、プリプリして滑らかな食感が感じられる素晴らしい料理だ。 1階の屋外テラスから2階のレストラン、3階のバー、最上階のパーティーラウンジまで。様々な広々としたスペースが用意されており、ペットの出入りも可能である。','ソウル龍山区普光120 ',' 02-796-5072',' http://blog.naver.com/cotejardin')";
        db.execSQL(q);


        q= "insert into ssam2 values('13','ソウル図書館の空の庭','東莞（パク・ソジュン）は、職場でのハードな一日を過ごしたエラ（キム・ジウォン）を抱いて「泣きたい時は、泣いてクールなよ」と彼女を慰める。東満州の懐でエラが涙を決めたのは、ソウル図書館屋上の空庭である。 1926年に建てられたこの場所は、80年以上にわたり、ソウルの歴史を見て、が、現在は建物の歴史的価値を認められ、（登録文化財第52号だ）図書館に生まれ変わった。本を読んで一息つきたい時は、屋上にある空の庭に行ってみよう。下には、ソウル広場、右と左のは、それぞれ徳寿宮と南山が見えて夜には照明が点灯して趣を加える。','ソウル特別市中区世宗路110号','',' http://lib.seoul.go.kr/ ')";
        db.execSQL(q);
        q= "insert into ssam2 values('14','不思議の国のミスユン','ドラマのもう一つの主人公、6年目のカップル雪姫（ソンハユン）と週間（安在鴻）。週間が家族に「雪姫または誰とも結婚していない」と彼女への愛情を表わしたところである。ここでは、童話の国のアリスが連想されるインテリアが印象的なカフェ兼ラウンジバー。昼には、コーヒーとブランチを楽しむことができ、夜にはカクテルやワインを飲むことができる。語り継が鹿茸とコーヒーを配合した鹿の角カフェラテは、ここだけのオリジナルメニューです。 2階のルーフトップで良才川の録音と涼しい風を満喫するいい。','ソウル瑞草区良才川に17道3','02-353-7777','')";
        db.execSQL(q);
        q= "insert into ssam2 values('15','ルカ511','エラはたびたびアナウンサー試験に滑るながら自分の夢をあきらめない不屈の青春だ。マイクを握ると自然に目がキラキラたてて声がランランなる彼女は、同期で冷たい熟結婚式で司会者代打に出て存分に才能を誇る。エラが美しいドレスを着て、社会を見屋外の結婚式は、<星から来た君>の撮影地としても有名なルカ511で開かれた。欧州の宮殿を模したデザインがエレガントな本館は、主にイベントの大先であり、別館はフレンチレストランである。本館ガーデン横出したとき、別館があり、本館と別館をつなぐ庭には風景が美しく、ガーデンウェディング会場として人気が高い。 ','ソウル江南区島山大路81道40地番清潭洞115-16 LUKAビル','02-540-6640','')";
        db.execSQL(q);
        q= "insert into ssam2 values('16','AYラウンジ','純愛医師ムービング（チェ・ウシク）は、結婚式で堂々として巧みに社会を見るエラの姿に反する。結婚式打ち上げに向けたバーでムービングの友人はエラにお酒を飲んだ勧めし、友人からエラを保護するために、彼は黒騎士を自任する。両方の縁が始まる打ち上げ場所がAYラウンジだ。 AYラウンジは<無限に挑戦阿修羅編>をはじめ、<またオヘヨウン>、<勝手に切なく>など各種ドラマと芸能プログラムの撮影地として知られ口コミを弾ところ。木と革で仕上げられてい古風で洗練されたインテリアはヨーロッパの城のような感じを与える。各種ドラマで定番として登場するのは、中央のバー桁が、パノラマ2階のソファから降りの眺めも良い。','ソウル江南区江南大路92道13','02-552-8199','')";
        db.execSQL(q);





        q= "insert into doctors2 values('17','ボンジュールハワイ','パラソル屋根が一目で入ってくる入口からエキゾチックな情緒漂うフュージョンレストラン「ボンジュールハワイ」。個性的な小物やインテリアはもちろん、店頭に響くハワイの伝統音楽が実際ハワイのどのカフェに来たような気分の良い錯覚を与えることを許可するところである。ソーセージ、ジャガイモ、焼き鳥、エビ、豚バラ肉が総集合した「BBQサンセット盛り合わせ」、「クリームカレーうどん」など、ユニークなフュージョン料理がここの看板メニューだ。また、中毒」麻薬ピザ」というニックネームがついた、ここだけのスペシャル料理である「寿司ピザ」のフルーツパンチカクテル一杯であればハワイ旅行も羨ましくない。\n" +
                "\n" +
                "ドラマ「ドクターズ> 4回で華やかに登場し気がかりなことを起こした「ボンジュールハワイ」は、すでに弘大の「ホットプレイス」で噂になっところである。 <ドクターズ>のヒロインユ・ヘジョン（パク・シネ）の親友チョンスンフイが運営するカフェ「スンニハワイ」でドラマにたまに登場したからだ。劇中ホンジホン（キム・レウォン）、ユ・ヘジョン（パク・シネ）カップルもここで冷たいビールと一緒にデートをジュルギゴンた。','04043ソウル麻浦区ジャンダリで3奥行23（西橋洞）','010-9756-5406','')";
        db.execSQL(q);
        q= "insert into doctors2 values('18','西村伝統スンデクック','ドラマ「ドクターズ>でユ・ヘジョン（パク・シネ）の父親が運営するクッパ家に登場した西村伝統スンデクックは買いのみ24時間とった濃いスープで有名なグルメだ。例な韓屋と清潔なインテリアは、景福宮周辺の景観と調和を成す。辛くて香ばしいスンデトグクも一品だが、レストランで直接漬けたキムチも、ソウルで一番おいしいキムチのいずれか挙げられるほどだ。食事を終えた後ジホ - ヘジョンカップルが一緒にクッパを楽しんだ場所で忘れずに記念写真を残して見ること！','\n" +
                "03027ソウル鍾路区サジクロ9パワーを解き放つ8（ピルウンドン） ','02-735-0122','')";
        db.execSQL(q);
        q= "insert into doctors2 values('19','ヤンチョルブク江東区聴き所','<相続人>、<ドクターズ>、<ピノキオ>など人気ドラマの主演として活躍した俳優パク・シネの両親が運営する二大窓の専門店。広々とした快適なお店のあちこちにパク・シネの肖像画やポスター、二伴侶犬を模した小物やケーキなどのファンからもらったプレゼントが展示されている。マクチャンともつ、両などの食材は、毎日の牛市場から空輸受け、クールですっきりしたムクバプをはじめとおかずも店頭で直接作る。スケジュールがない日には、パク・シネが、多くの場合、同僚たちと一緒に訪問する。','05399ソウル江東区城内に62（城内洞、遊園ビル）','02-478-1192','')";
        db.execSQL(q);







        q= "insert into doggabi2 values('20','イルガムホ','自分の初恋テヒ（ジョンヘイン）に会ったたタック（ギムゴウン）。湖畔を背景に、図のような場面が演出されたのはイルガムホだ。建国大学内に位置しよく「建大湖」とも呼ばれ呼ばれるが、在学生だけではなく、すべての開いている。春と夏には湖をめぐる木と花の香りがシングロウォ余裕のあるひとときを過ごすのに十分である。日が暮れると湖に映るアーチ橋の明かりが魅力的な夜景をプレゼントする。','ソウル広津区アクティブ120','','')";
        db.execSQL(q);
        q= "insert into doggabi2 values('21','雲峴宮洋館','‘\n" +
                "あなたの世界で最も安全な場所に呼ぶよ。」ウンタクが危険にさらされるたびに鬼が彼歌った家は、鐘路に位置する雲峴宮洋館である。壮大で豪華な外観のお化けの家に鬼と死神、たタクイ一緒に住んでいた。雲峴宮は興宣大院君の私邸では、彼の息子で、朝鮮26代王である高宗が生まれて成長したところである。「義烏共著」とも呼ばれる雲峴宮洋館は、日本が朝鮮王族を監視する目的で、大院君の孫に建てた。ヨーロッパ風の近代式建物で、派手だが、悲しい事情が込められたところ。 <鬼>以外にも、<宮> <ダッキング・トゥ・ハーツ」など、さまざまなドラマのロケ地として登場し、遺物の展示をはじめ、伝統衣装体験、歴史コンサートなど多様な伝統文化を体験することができる。','ソウル鍾路区三日通り464','02-765-1840 ',' http://www.unhyeongung.or.kr/')";
        db.execSQL(q);
        q= "insert into doggabi2 values('22','ユンボソンガ','\n" +
                "おばあちゃんの幽霊に宝くじ当選番号を教えてくれたウンタクの目の前に突然現れたキム・シン。驚いたの両方後ろに見える静まり返っ石垣が目を引く場所は安国洞ユンボソンガ一帯だ。ソウル特別市民俗文化財第27号尹ボ善行く尹ボ善元大統領の一家が4代目住む家だ。尹ボ善家屋の内部は入場することができませんが、周辺の石垣道は静かな雰囲気のための写真撮影場所に多くの観光客に愛される場所。韓服を着て記念撮影をするこれら簡単に見ることができる。',' 鍾路区尹ボ善道62','','')";
        db.execSQL(q);
        q= "insert into doggabi2 values('23','ワンデー韓服','ユンボソンガ近くのワンデー韓服は、伝統的な韓服からカラフルな装飾の融合韓服、快適な生活韓服と子供韓服まで1,000以上の稼ぎを超える様々な韓服を貸与することができる。特徴は、他の所で雨に価格が非常に安いということ。 4時間利用は15,000ウォン、24時間利用は28,000ウォンである。英語、中国語、日本語など、様々な外国語を話すスタッフが常駐しており、外国人の友人と一緒にいい。\n" +
                "ユンボソンガ一帯を歩いていると向かいの精読図書館塀基づい特に狭く曲がりくねった坂道を出会う。三清洞のお茶を飲む庭は、様々な伝統茶を味わうことができる所で、韓服できれいに着飾って訪問するのに最適である。 100年以上の歴史を持つ伝統家屋の中には清潔に栽培された庭園と池が位置する。春と夏には、冷たい五味子茶とトックリイチゴ車人気メニューで、フォッシルた食感のかぼちゃ蒸し餅を添えればさらにおいしそうだ。','ソウル鍾路区北村5道4','070-4202-4310','http://www.onedayhanbok.com/')";
        db.execSQL(q);




        q= "insert into ddoohaeyoung2 values('24','三清洞路地,コーヒーミル','バクドギョンとオヘヨウンが鳴り時も笑うときも、戦う時も優しするときもいつも一緒だったところ、一緒に歩いた道である。既に恋人たちにうわさが私三清洞路地は、まさに歩く楽しみ、風景を楽しむ楽しみがある。ドラマ史上最も激しかった道警とヘヨンのキスシーンもここ誕生した。ここにするには1号線鐘閣駅から仁寺洞の道に沿って歩き風評女子高を過ぎ、その道をずっと上って行かなければならない。左側には、三清洞の最古参であるカフェ「コーヒーミル」が位置しているがヘヨンと道警はここでコーヒーではなく、ご飯を食べドレトダ。歩いて暑いコーヒーミルに立ち寄って冷たいアイスコーヒー一杯を飲んでも良く、左に曲がって、狭い路地の隅々を縫って通ってもよい。ただし、実際の居住地であるため、声高に騒ぐのは禁物だ。 ','ソウル鍾路区北村5パワーを解き放つ8-11','02-732-7656','')";
        db.execSQL(q);
        q= "insert into ddoohaeyoung2 values('25','亀浦麺','漢城大入口駅から出発して、そろそろ歩いてみると発見することになる国のコレクションである。低い屋根に囲まれた静かな村の雰囲気とそっくり亀浦麺は、<またオヘヨウン> 5回でヘヨンと道警が苦い心を焼酎一杯に癒したところである。夜に店の前に立っている場合、照明された漢陽都城が見えるので、これほどの風情があるか。亀浦麺の店は、画面でも一見示すよう綺麗花壇に直面している。素朴な花と小さな木が1970年代に似た亀浦麺の雰囲気と絶妙に合致する。亀浦麺に寄って涼しい夜風と麺たボールに熱を飛ばしてみてはどうだろう。ここで<またオヘヨウン>の道警とヘヨンのように焼酎一杯のロマンまで得た場合、それこそ地上の楽園が別にないだろう。 ','ソウル特別市城北区城北に52-1','02-744-0215','')";
        db.execSQL(q);
        q= "insert into ddoohaeyoung2 values('26','ダイニングバールー','「きれいな」オヘヨウンと「ただ」オヘヨウンが会社の同僚たちと一緒に燃える夜を過ごしたところ！ダイニングバーホルダー。飲酒歌舞の決定版を見せてくれた飲み会のシーンで目立ったのは、広々とした空間にぎっしり打ち込まれた華やかな照明と高く壮大な天井。景福宮の慶会楼（慶會樓）をモチーフにしたという内装は、それ自体だけで店の雰囲気を圧倒する。何よりも小規模ハウスウェディング、ランチングショー、ファッションショー、ショーケース、展示会、コンサートなど多彩な文化イベントやプライベートパーティーを進行することができる複合文化空間という点が特徴である。平日18時から22時まで無制限ワインビュッフェも進めているなんて飲み会や会議を準備する人であれば、チェックしておこう。 20種類の多彩なおつまみメニューと一緒に様々な準備ワインと生ビールを楽しむことができる。オヘヨウンと会社の同僚のように楽しく飲んで歌って踊って派手な払金を過ごしたい人に積極的に推薦する。 ','ソウル江南区永東大路に513コエックスコンベンションセンター1階（卒業生）','02-6002-2003','www.coexourhome.co.kr')";
        db.execSQL(q);




        q= "insert into bulgudae2 values('27','ソウル市立美術館','徳寿宮の石垣道でチョンドンキルに入れば古風な建物にしたままで立っている。ソウル市立美術館西小門本館ある。展示よりも先に美術館の建物自体の建築美が目立つ。美術館側はルネッサンス様式の旧最高裁判所の前面部はそのまま保存して背面に近代的な建物を新築した。美術館に入った時一番最初に会うスペースがすぐに昔の建物の前面部と新しい建物の壁面をガラスに接続されたパラメータ空間である。\n" +
                "特にガラスの天井に降り注ぐ自然光は本当に魅力的だ。ソウル市立美術館の展覧会は、専門性と大衆性を適切に調和させることで有名である。シャガール、ピカソ、マティス、マグリット、ゴッホなど美術に門外漢の人も習得分かる世界的に有名画家の展覧会は、もちろん、国際的なメディアアートビエンナーレ、美術館春の外出前など特色ある企画展示を披露する。 ',' 04515ソウル市中区徳寿宮道61（西小門洞、ソウル市立美術館）','02-2124-8800','http://sema.seoul.go.kr/')";
        db.execSQL(q);
        q= "insert into bulgudae2 values('28','ルカ511','ルカ511は江南区清潭洞の真ん中に位置する雰囲気の良いイタリアンレストランである。都心の中の阿房宮と呼ばれるルカ511はスモールウェディングが行われることもあり、ドラマ「星から来た君>、<リメンバー - 息子の戦争」、そして「私たち結婚しました」などのプログラム地でもある。 ',' 06010ソウル江南区倒産通り81道40（チョンダムドン、LUKE511ビル）','02-540-6640','https://www.instagram.com/luka511_seoul/')";
        db.execSQL(q);
        q= "insert into bulgudae2 values('29','DDP（東大門デザインプラザ）','韓流女神トップスターチョンソンイと外界南ドミンジュンのロマンスを描いた星から来た君。全体的にドラマの視聴率が低くなった時点で最高視聴率28.1％を記録してあまりにも有名になったチメクだけでなく、毎回ドラマの中のファッションと出演陣、撮影されたところまですべて話題になった。まだ多くの人が覚えて思い浮かべるの星から来た君の中地の代表的なところは、まさにNソウルタワーである。ソウルを一望できる南山の名所としてすでに有名だが、チョンソンイとドミンジュンの愛の物語で、ここでは、さらにロマンチックな場所となった。\n" +
                "風情ある徳寿宮の石垣道に位置ソウル市立美術館はドミンジュンとドミンジュンの仲良し、長弁護士が一緒に散歩をして会話をするチョンソンイにかかってきた電話を受ける場面が撮影された。ここでは、美術鑑賞はもちろん、近代式の建物と一緒に可愛らしい屋外庭園がございますので、ドミンジュンの心を打ち明けることができる仲良しと散歩するちょうど良い場所だ\n" +
                "最終回に戻って地球に戻ってきた島民基準がチョンソンイとロマンチックなキスを交わしたのは、国立劇場である。実際、60年を超える歴史を受け継いできた公演界の中心地として、毎月様々な公演に会うことができるところである。\n" +
                "そのほかにも、鍋うどんを食べたいというチョンソンイのためキム・スヒョンが立ち寄った国の収集、章弁護士と道民与えた話を交わした喫茶店などの星から来た君撮影地だけでソウルのあちこちを探索することができる。','04566ソウル市中区乙支路281 （乙支路7が）','02-2153-0000','http://www.ddp.or.kr/main')";
        db.execSQL(q);
        q= "insert into bulgudae2 values('30','パムパムピアノダイニングバー','パムパムピアノは定数のダイニングすぐ過去にピアノ店を運営していた場所に、既存の名前をそのまま使用している。内部はリラックスした雰囲気を浮かべており、壁紙から簡単に見ることができないインテリア小物たちまで、古風ながらもユニークな感じの東西の調和を楽しむことができるところである。','04074ソウル麻浦区ワウ山で3道21 1階','\n" +
                "070-4068-2669','https://www.facebook.com/pp.piano.seoul')";
        db.execSQL(q);



        q= "insert into taeyang2 values('31','非プルロスエム','\n" +
                "<太陽の末裔> 2回の一場面。アフガニスタンで帰ってきたユシジンが剛毛ヤン病院前、彼女を待っている。ユシジンは彼女と思いがけない食事をしようとしたが、頭もない感剛毛凧彼を取る立ち寄ったところは、まさに自分の家。さらに外食の代わりにご飯をさせて食べて最初のデートが始まる場面だ。ドラマの中よく登場する華やかなオフィスではなくて、より一層目が行った場所は他でもない、ソウル麻浦区延南洞の家具店以外のプルロスエム。 30坪の住宅を改造して店頭で使用している環境にやさしい原木家具を販売している。撮影当時ユシジンと剛毛たこ飯を食べた席にはもうベッドが入っていますが、ここだけの快適で暖かい感じだけは変わらなかった。','ソウル麻浦区ソンミ山に29道23','02-336-7181','www.bplusm.co.kr')";
        db.execSQL(q);
        q= "insert into taeyang2 values('32','CGV 弘大','\n" +
                "剛毛凧とユシジンの最初の映画デートが実現されたのは、実際に剛毛ヤン家とも遠く離れていないCGV弘大だ。撮影が行われた6管はドラマが放映された直後ソン・ジュンギとソン・ヘギョのデートスポットにうわさが立ってわざわざ訪ねてくる観客も増えた。彼ら座っI熱6番と7番に座って映画を待っていると、「私は今、このときめく。美人と一緒にいて」という話をする甘いユシジンのセリフがありありと蘇る感じが担架だけだ。ただし、隣の席には必ず異性が座っていること！同じ映画館であるが恋人たちにこそ違った思い出を与えることができる場所だ。 ','ソウル麻浦区ポジで153、第4層',' 1544-1122','www.cgv.co.kr')";
        db.execSQL(q);
        q= "insert into taeyang2 values('33','サブウェイノンヒョン力点','\n" +
                "剛毛凧 \"チョコチップクッキーセットの追加」と「ハルラピニョ束！」を叫んだところである。剛毛凧はサブウェイノンヒョン力点で仲間たちのためにサンドイッチをした美しい買い入ることもしたしユシジントラックと甘くブランチデートを楽しむこともした。パンと中材、ソースまで選択できるサブウェイの特徴は、ドラマの中の剛毛ヤン大使もそのまま表れている。すでに全世界的に人気を得ているサンドイッチ店が、剛毛凧好きだという「タマネギ抜いハルラピニョがたくさん入ったクラブサンドイッチ」を直接味見一度は立ち寄ってもいいだろうか。ソソが興味深い経験になるだろう。','ソウル瑞草区江南大路535プリンスビル',' 02-512-1014',' www.subwaykorea.co.kr')";
        db.execSQL(q);
        q= "insert into taeyang2 values('34','甘くコーヒーヤンジェジョム','<太陽の末裔> 6回では、それこそソデヨウン上司とユンミョンジュ中尉の愛情シーンが光を放ったが内容インジュクスンこうだ。ソデヨウンは窓ガラスの外に立っているユンミョンジュに向かって唇を差し出しハメ撮りを撮る。窓ガラスを挟んで二人はまるでキスをするようなジェスチャーを取り、ロマンチックなムードを形成する。別名救いカップルと呼ばれる彼らのデートシーンは甘く、コーヒーヤンジェジョムで撮影された。実際に甘く、コーヒーヤンジェジョムには太陽の末裔ポスターがあちこちに付いている。救いのカップルが座った席を探しにはそれほど長い時間がかからない。二人が座った席には親切にも「ここはまさに太陽の末裔救いカップル桁かのです！」というフレーズが書かれているからだ。恋人たちなら「救いカップル」が座った席で直接ソデヨウンとユンミョンジュになって「ハメ撮り」を撮ってみるのもかなり良い楽しさになるだろう','ソウル瑞草区江南大路27道7-21','02-529-8399','http://www.dalkomm.com/index.php')";
        db.execSQL(q);




        q= "insert into oungpal2 values('35','サンムンドン','\n" +
                "<応答せよ1988>の同い年の幼なじみの友人ドクソンとジョンファン、選択、ソヌ、ドンリョンはサンムンドン住宅街のフェンスを向き合っ隣人である。劇中ドクソンは「サンムン女子高」に、男主人公は「サンムンと」に通うこと描かれるが、実際にサンムンドンの名前を冠した学校は「サンムン小学校」が唯一だ。ただしドラマで映し出される路地の風景や通学バスの路線などを見て両方の学校の実際のモデルでは、定義女子高とソンドクゴであると推定されている. \n" +
                "双門駅4番出口から定義女子高まで向かう路地では、すぐにでも<応答せよ1988>の中の主人公を遭遇だけのような懐かしい住宅街が現れる。長年がにじみ出るランドリーと薬局、赤いブロック塀のこじんまりとした住宅が集まっている風景が子供の頃の郷愁を呼び起こす。 \n" +
                "「今日、ブラジルトッポッキ行く？」\n" +
                "\n" +
                "劇中ドクソンや友人の会話によく登場する、そこ、ブラジルトッポッキ。少し奇妙な名前を持つこの粉食店は、1990年代後半まで実在していた所で、当時の定義女子高前評判の食堂だった。\n" +
                " ','','','')";
        db.execSQL(q);
        q= "insert into oungpal2 values('36','ほほ粉飾','2018年現在、ブラジルトッポッキは、その場にいないが、定義女子高前右側の狭い路地を過ぎると、長い時間データを取ったようにした粉飾家々が集まっている。ここで粉食店に毎共通に出す独特のメニューが一つあり、他でもない「チーズご飯」である。金粉末を分散させたチャーハンの上にモッツァレラチーズをのせたもので、価格も安くて近くの学生に人気と。手頃な価格はもちろん、学生時代を思わせる、その味を感じることができる。\n" +
                "','ソウル道峰区道峰に121の道32','','')";
        db.execSQL(q);
        q= "insert into oungpal2 values('37','ドゥリミュージアム','ドゥリミュージアム観覧後は、ドゥリ公園を通って、北朝鮮産の周囲の道に向けたり、道峰区を横切る憂川辺で散歩が可能である。ドゥリミュージアムでサンムン1洞住民センター方向に15分ほど歩いてくるとドゥリが最初に発見されたオイチョン（数儒教の近く）を満たすことができる。数儒教を起点に約150mの区間に渡って置くわけ壁画が造成されているが、原作者であるキム・スジョン作家が壁画の草案を描いた後、徳性女子大在学生・専門家70人が手を合わせて一緒に描いて出した。中浪川の支流の中で最も規模が大きいオイチョンは長さが約8㎞に達し、ドゥリ壁画はもちろん季節ごとに咲く野の花を背景にゆっくり散策するいい。 ','ソウル道峰区シルボンで1道6','02-990-2200',' http://www.doolymuseum.or.kr/')";
        db.execSQL(q);




    }

    public void selectData() {
        String q = "select *from "+newname+"";
        plist.clear();
//        cursor select 해온 data집합
        Cursor cursor = db.rawQuery(q, null);

//        첫번째 cursor는 제목 줄
        if (cursor != null) {
//            실제데이터를 가르킴
            while (cursor.moveToNext()/*다음 투플로 넘어감*/) {
//                table에서 각 어트리뷰트에 넣음


                String name = cursor.getString(0);
                String name2=cursor.getString(1);

                if(name.equals("1")){
                    draw1 = R.mipmap.b1_2;

                }else if(name.equals("2")){
                    draw1 = R.mipmap.b2_1;

                }else if(name.equals("3")){
                    draw1 = R.mipmap.b3_1;

                }else if(name.equals("4")){
                    draw1 = R.mipmap.b4_1;

                }else if(name.equals("5")){
                    draw1 = R.mipmap.b5_2;

                }else if(name.equals("6")){
                    draw1 = R.mipmap.b6_1;
                }else if(name.equals("7")){
                    draw1 = R.mipmap.b7_2;

                }else if(name.equals("8")){
                    draw1 = R.mipmap.b8_1;
                }else if(name.equals("9")){
                    draw1 = R.mipmap.b9_1;
                }else if(name.equals("10")){
                    draw1 = R.mipmap.b10_1;

                }else if(name.equals("11")){
                    draw1 = R.mipmap.b11_1;

                }else if(name.equals("12")){
                    draw1 = R.mipmap.b12_1;

                }else if(name.equals("13")){
                    draw1 = R.mipmap.b13_1;

                }else if(name.equals("14")){
                    draw1 = R.mipmap.b14_2;

                }else if(name.equals("15")){
                    draw1 = R.mipmap.b15_1;

                }else if(name.equals("16")){
                    draw1 = R.mipmap.b16_1;

                }else if(name.equals("17")){
                    draw1 = R.mipmap.b17_1;

                }else if(name.equals("18")){
                    draw1 = R.mipmap.a18_1;

                }else if(name.equals("19")){
                    draw1 = R.mipmap.b19_2;

                }else if(name.equals("20")){
                    draw1 = R.mipmap.b20_1;

                }else if(name.equals("21")){
                    draw1 = R.mipmap.b21_2;

                }else if(name.equals("22")){
                    draw1 = R.mipmap.b22_1;

                }else if(name.equals("23")){
                    draw1 = R.mipmap.b23_1;

                }else if(name.equals("24")){
                    draw1 = R.mipmap.b24_2;

                }else if(name.equals("25")){
                    draw1 = R.mipmap.b25_1;

                }else if(name.equals("26")){
                    draw1 = R.mipmap.b26_1;

                }else if(name.equals("27")){
                    draw1 = R.mipmap.b27_1;

                }else if(name.equals("28")){
                    draw1 = R.mipmap.b28_1;

                }else if(name.equals("29")){
                    draw1 = R.mipmap.b29_1;

                }else if(name.equals("30")){
                    draw1 = R.mipmap.b30_1;

                }else if(name.equals("31")){
                    draw1 = R.mipmap.b31_2;

                }else if(name.equals("32")){
                    draw1 = R.mipmap.b32_1;

                }else if(name.equals("33")){
                    draw1 = R.mipmap.b33_1;

                }else if(name.equals("34")){
                    draw1 = R.mipmap.b34_1;

                }else if(name.equals("35")){
                    //
                    draw1 = R.mipmap.b35_2;

                }else if(name.equals("36")){
                    draw1 = R.mipmap.b36_3;

                }else if(name.equals("37")){
                    draw1 = R.mipmap.b37_1;

                }else if(name.equals("38")){
                    draw1 = R.mipmap.a38_1;

                }
                Productadd p1 = new Productadd(draw1,name2);
                plist.add(p1);
            }
            adapter.notifyDataSetChanged();


        }
    }
//    public void store(View view){
//                String q = ("insert into member2 values('"+newname+"','','','"+newcal+"'" +
//                        ")");
//                db.execSQL(q);
//                db.close();
//                Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
//        mDialog = new CDialog(this,"재료",
//                leftListener,rightListener);
//        mDialog.show();
//
//            }
        }




