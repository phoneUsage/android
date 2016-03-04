package edu.dartmouth.phoneusage.voice;


public class SpeechDetector {
	
	  public static double classify(Object[] i)
	    throws Exception {

	    double p = Double.NaN;
	    p = SpeechDetector.N58df4ab20(i);
	    return p;
	  }
	  static double N58df4ab20(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 0.11925351073052719) {
	    p = SpeechDetector.N2ba119b31(i);
	    } else if (((Double) i[4]).doubleValue() > 0.11925351073052719) {
	    p = SpeechDetector.N179b9b1b196(i);
	    } 
	    return p;
	  }
	  static double N2ba119b31(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 100.94806637560343) {
	    p = SpeechDetector.N5d9e4d252(i);
	    } else if (((Double) i[0]).doubleValue() > 100.94806637560343) {
	    p = SpeechDetector.N6781a7dc188(i);
	    } 
	    return p;
	  }
	  static double N5d9e4d252(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -0.6195033504820546) {
	    p = SpeechDetector.N43dae8273(i);
	    } else if (((Double) i[5]).doubleValue() > -0.6195033504820546) {
	    p = SpeechDetector.N7d8637cc39(i);
	    } 
	    return p;
	  }
	  static double N43dae8273(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 9.798854286914448) {
	    p = SpeechDetector.N58bf7b3e4(i);
	    } else if (((Double) i[1]).doubleValue() > 9.798854286914448) {
	    p = SpeechDetector.N59229fdf36(i);
	    } 
	    return p;
	  }
	  static double N58bf7b3e4(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -2.958059447751246) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -2.958059447751246) {
	    p = SpeechDetector.N33450f75(i);
	    } 
	    return p;
	  }
	  static double N33450f75(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 87.8585903383834) {
	    p = SpeechDetector.N5faf89c56(i);
	    } else if (((Double) i[0]).doubleValue() > 87.8585903383834) {
	    p = SpeechDetector.Nd8db7ce26(i);
	    } 
	    return p;
	  }
	  static double N5faf89c56(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 4.4697467507172) {
	    p = SpeechDetector.N7d7e15967(i);
	    } else if (((Double) i[2]).doubleValue() > 4.4697467507172) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7d7e15967(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 1.9395897520727008) {
	    p = SpeechDetector.N60bb6b378(i);
	    } else if (((Double) i[8]).doubleValue() > 1.9395897520727008) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N60bb6b378(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 0.5548114849247597) {
	    p = SpeechDetector.N307c197e9(i);
	    } else if (((Double) i[6]).doubleValue() > 0.5548114849247597) {
	    p = SpeechDetector.N784f349b11(i);
	    } 
	    return p;
	  }
	  static double N307c197e9(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 0.5305521157927965) {
	    p = SpeechDetector.N236db81010(i);
	    } else if (((Double) i[3]).doubleValue() > 0.5305521157927965) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N236db81010(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 4.340402740005371) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 4.340402740005371) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N784f349b11(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= 1.1593653528567456) {
	    p = SpeechDetector.N1806e9d212(i);
	    } else if (((Double) i[10]).doubleValue() > 1.1593653528567456) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1806e9d212(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 2.5113083620436654) {
	    p = SpeechDetector.N6de0e65013(i);
	    } else if (((Double) i[11]).doubleValue() > 2.5113083620436654) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6de0e65013(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 65.72593819639319) {
	    p = SpeechDetector.N4830c68b14(i);
	    } else if (((Double) i[0]).doubleValue() > 65.72593819639319) {
	    p = SpeechDetector.N7a3af4b315(i);
	    } 
	    return p;
	  }
	  static double N4830c68b14(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 57.176708368518796) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 57.176708368518796) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7a3af4b315(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 0.673919846396136) {
	    p = SpeechDetector.N3497527616(i);
	    } else if (((Double) i[1]).doubleValue() > 0.673919846396136) {
	    p = SpeechDetector.N3aa6dbf317(i);
	    } 
	    return p;
	  }
	  static double N3497527616(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 79.5830361137176) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 79.5830361137176) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3aa6dbf317(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -1.7270225288319352) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -1.7270225288319352) {
	    p = SpeechDetector.N20b24c9a18(i);
	    } 
	    return p;
	  }
	  static double N20b24c9a18(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -2.0859885377722884) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -2.0859885377722884) {
	    p = SpeechDetector.N19c3233b19(i);
	    } 
	    return p;
	  }
	  static double N19c3233b19(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -1.8411401159199943) {
	    p = SpeechDetector.N5a3e03b320(i);
	    } else if (((Double) i[11]).doubleValue() > -1.8411401159199943) {
	    p = SpeechDetector.N54b8d33522(i);
	    } 
	    return p;
	  }
	  static double N5a3e03b320(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -0.49785976774200547) {
	    p = SpeechDetector.N1d650b0e21(i);
	    } else if (((Double) i[10]).doubleValue() > -0.49785976774200547) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1d650b0e21(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 0.7565218942957085) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > 0.7565218942957085) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N54b8d33522(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 3.8607061344498526) {
	    p = SpeechDetector.N3232680723(i);
	    } else if (((Double) i[7]).doubleValue() > 3.8607061344498526) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3232680723(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 3.51451520334675) {
	    p = SpeechDetector.Nb4bbd5024(i);
	    } else if (((Double) i[1]).doubleValue() > 3.51451520334675) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nb4bbd5024(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 68.69466305345854) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 68.69466305345854) {
	    p = SpeechDetector.N1979d4fb25(i);
	    } 
	    return p;
	  }
	  static double N1979d4fb25(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -3.4643853528084945) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -3.4643853528084945) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nd8db7ce26(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 7.736257917942028) {
	    p = SpeechDetector.N531e3c5527(i);
	    } else if (((Double) i[1]).doubleValue() > 7.736257917942028) {
	    p = SpeechDetector.N4694e47435(i);
	    } 
	    return p;
	  }
	  static double N531e3c5527(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -1.5981018264263749) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -1.5981018264263749) {
	    p = SpeechDetector.N660b1b1428(i);
	    } 
	    return p;
	  }
	  static double N660b1b1428(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -5.446326413086923) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -5.446326413086923) {
	    p = SpeechDetector.N631ef26229(i);
	    } 
	    return p;
	  }
	  static double N631ef26229(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -2.4212433129470394) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -2.4212433129470394) {
	    p = SpeechDetector.N4bb32c530(i);
	    } 
	    return p;
	  }
	  static double N4bb32c530(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -3.4626914032536424) {
	    p = SpeechDetector.N1e0225f031(i);
	    } else if (((Double) i[5]).doubleValue() > -3.4626914032536424) {
	    p = SpeechDetector.N1f08bef432(i);
	    } 
	    return p;
	  }
	  static double N1e0225f031(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 2.645948015726413) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 2.645948015726413) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1f08bef432(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 4.2658352132471204) {
	    p = SpeechDetector.N7730951633(i);
	    } else if (((Double) i[7]).doubleValue() > 4.2658352132471204) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7730951633(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -0.5545547692518406) {
	    p = SpeechDetector.N168c147c34(i);
	    } else if (((Double) i[2]).doubleValue() > -0.5545547692518406) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N168c147c34(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -0.022412592249050883) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -0.022412592249050883) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4694e47435(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -1.7174068974124022) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -1.7174068974124022) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N59229fdf36(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 83.28466354490789) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 83.28466354490789) {
	    p = SpeechDetector.N702e173037(i);
	    } 
	    return p;
	  }
	  static double N702e173037(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -4.111983766489422) {
	    p = SpeechDetector.N61f489d938(i);
	    } else if (((Double) i[6]).doubleValue() > -4.111983766489422) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N61f489d938(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -1.5903949688129095) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -1.5903949688129095) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7d8637cc39(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -3.9744483347427537) {
	    p = SpeechDetector.N76b9727540(i);
	    } else if (((Double) i[4]).doubleValue() > -3.9744483347427537) {
	    p = SpeechDetector.N1aab1ff265(i);
	    } 
	    return p;
	  }
	  static double N76b9727540(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 89.52171726825557) {
	    p = SpeechDetector.N9099c3841(i);
	    } else if (((Double) i[0]).doubleValue() > 89.52171726825557) {
	    p = SpeechDetector.N2a760b251(i);
	    } 
	    return p;
	  }
	  static double N9099c3841(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -7.466020579028322) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -7.466020579028322) {
	    p = SpeechDetector.N55ef252a42(i);
	    } 
	    return p;
	  }
	  static double N55ef252a42(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 83.56971269626086) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 83.56971269626086) {
	    p = SpeechDetector.N4771147943(i);
	    } 
	    return p;
	  }
	  static double N4771147943(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -0.8674998431592204) {
	    p = SpeechDetector.N50f7389344(i);
	    } else if (((Double) i[10]).doubleValue() > -0.8674998431592204) {
	    p = SpeechDetector.N4115fa1046(i);
	    } 
	    return p;
	  }
	  static double N50f7389344(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 2.1587532262148654) {
	    p = SpeechDetector.N16a3646c45(i);
	    } else if (((Double) i[1]).doubleValue() > 2.1587532262148654) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N16a3646c45(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 87.34729386323825) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 87.34729386323825) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4115fa1046(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -2.5063509526712213) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -2.5063509526712213) {
	    p = SpeechDetector.N9d451d247(i);
	    } 
	    return p;
	  }
	  static double N9d451d247(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -2.5379787012187336) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -2.5379787012187336) {
	    p = SpeechDetector.N5247b70848(i);
	    } 
	    return p;
	  }
	  static double N5247b70848(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 2.5778341012689574) {
	    p = SpeechDetector.N6241986b49(i);
	    } else if (((Double) i[9]).doubleValue() > 2.5778341012689574) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6241986b49(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -6.606134458735578) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -6.606134458735578) {
	    p = SpeechDetector.N407dcb3250(i);
	    } 
	    return p;
	  }
	  static double N407dcb3250(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -6.72475651159747) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -6.72475651159747) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2a760b251(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -7.564997538618807) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -7.564997538618807) {
	    p = SpeechDetector.N3abd477a52(i);
	    } 
	    return p;
	  }
	  static double N3abd477a52(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 0.9988651931029308) {
	    p = SpeechDetector.N609fb8b653(i);
	    } else if (((Double) i[3]).doubleValue() > 0.9988651931029308) {
	    p = SpeechDetector.N3527c4a60(i);
	    } 
	    return p;
	  }
	  static double N609fb8b653(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 10.055007619216491) {
	    p = SpeechDetector.N1617e64954(i);
	    } else if (((Double) i[1]).doubleValue() > 10.055007619216491) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1617e64954(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -2.271592722712821) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() > -2.271592722712821) {
	    p = SpeechDetector.N7b0fcdf355(i);
	    } 
	    return p;
	  }
	  static double N7b0fcdf355(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -3.1108503123544082) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -3.1108503123544082) {
	    p = SpeechDetector.N4a9a4ba356(i);
	    } 
	    return p;
	  }
	  static double N4a9a4ba356(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -4.691143457439905) {
	    p = SpeechDetector.N57dbe09857(i);
	    } else if (((Double) i[4]).doubleValue() > -4.691143457439905) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N57dbe09857(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -3.33282372599026) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -3.33282372599026) {
	    p = SpeechDetector.N2476483858(i);
	    } 
	    return p;
	  }
	  static double N2476483858(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 2.044498230178049) {
	    p = SpeechDetector.N517f673b59(i);
	    } else if (((Double) i[2]).doubleValue() > 2.044498230178049) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N517f673b59(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= -3.327564199220219) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > -3.327564199220219) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3527c4a60(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 0.8533049720206592) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 0.8533049720206592) {
	    p = SpeechDetector.N1c5ddffa61(i);
	    } 
	    return p;
	  }
	  static double N1c5ddffa61(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -5.983103125539158) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -5.983103125539158) {
	    p = SpeechDetector.N571ba4a262(i);
	    } 
	    return p;
	  }
	  static double N571ba4a262(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -0.9620280945538756) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > -0.9620280945538756) {
	    p = SpeechDetector.N57d5b45b63(i);
	    } 
	    return p;
	  }
	  static double N57d5b45b63(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -3.902162072805393) {
	    p = SpeechDetector.Nf33ef6a64(i);
	    } else if (((Double) i[11]).doubleValue() > -3.902162072805393) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nf33ef6a64(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -6.264249465747811) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -6.264249465747811) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1aab1ff265(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 76.61316451433282) {
	    p = SpeechDetector.N58be568b66(i);
	    } else if (((Double) i[0]).doubleValue() > 76.61316451433282) {
	    p = SpeechDetector.N152e13f4129(i);
	    } 
	    return p;
	  }
	  static double N58be568b66(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 57.43929897636532) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 57.43929897636532) {
	    p = SpeechDetector.N3823ed3167(i);
	    } 
	    return p;
	  }
	  static double N3823ed3167(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 6.706558575510736) {
	    p = SpeechDetector.N3ea948c268(i);
	    } else if (((Double) i[1]).doubleValue() > 6.706558575510736) {
	    p = SpeechDetector.N3c09d515114(i);
	    } 
	    return p;
	  }
	  static double N3ea948c268(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 65.81854096665812) {
	    p = SpeechDetector.N5be7d8b169(i);
	    } else if (((Double) i[0]).doubleValue() > 65.81854096665812) {
	    p = SpeechDetector.N6b7de5ce73(i);
	    } 
	    return p;
	  }
	  static double N5be7d8b169(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 4.302495179749547) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 4.302495179749547) {
	    p = SpeechDetector.N52437b9a70(i);
	    } 
	    return p;
	  }
	  static double N52437b9a70(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 4.711558713285628) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 4.711558713285628) {
	    p = SpeechDetector.N4c67e5a771(i);
	    } 
	    return p;
	  }
	  static double N4c67e5a771(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -0.3042400577844822) {
	    p = SpeechDetector.N39165e2172(i);
	    } else if (((Double) i[11]).doubleValue() > -0.3042400577844822) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N39165e2172(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 62.51911508367242) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 62.51911508367242) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6b7de5ce73(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 4.260026861995241) {
	    p = SpeechDetector.N167a6e8474(i);
	    } else if (((Double) i[9]).doubleValue() > 4.260026861995241) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N167a6e8474(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 4.775340869395364) {
	    p = SpeechDetector.N3feda7a375(i);
	    } else if (((Double) i[7]).doubleValue() > 4.775340869395364) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3feda7a375(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= -0.5301343297129328) {
	    p = SpeechDetector.Nb98df1f76(i);
	    } else if (((Double) i[1]).doubleValue() > -0.5301343297129328) {
	    p = SpeechDetector.N326a40d679(i);
	    } 
	    return p;
	  }
	  static double Nb98df1f76(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 4.453845040186951) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 4.453845040186951) {
	    p = SpeechDetector.N6160722b77(i);
	    } 
	    return p;
	  }
	  static double N6160722b77(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 6.248236531322407) {
	    p = SpeechDetector.N2e796ff78(i);
	    } else if (((Double) i[5]).doubleValue() > 6.248236531322407) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2e796ff78(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= -0.6597801055940289) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > -0.6597801055940289) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N326a40d679(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -2.252911285845018) {
	    p = SpeechDetector.N5dc6bb7580(i);
	    } else if (((Double) i[4]).doubleValue() > -2.252911285845018) {
	    p = SpeechDetector.N475b73eb87(i);
	    } 
	    return p;
	  }
	  static double N5dc6bb7580(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 3.6569073527325386) {
	    p = SpeechDetector.N223d2e6c81(i);
	    } else if (((Double) i[5]).doubleValue() > 3.6569073527325386) {
	    p = SpeechDetector.N442a940386(i);
	    } 
	    return p;
	  }
	  static double N223d2e6c81(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 0.3681790137508628) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > 0.3681790137508628) {
	    p = SpeechDetector.N5eb2c60382(i);
	    } 
	    return p;
	  }
	  static double N5eb2c60382(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 72.26817242158788) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 72.26817242158788) {
	    p = SpeechDetector.N2ae61f8783(i);
	    } 
	    return p;
	  }
	  static double N2ae61f8783(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 73.11563814336102) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 73.11563814336102) {
	    p = SpeechDetector.N6a1fee1184(i);
	    } 
	    return p;
	  }
	  static double N6a1fee1184(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 5.5137798420804405) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 5.5137798420804405) {
	    p = SpeechDetector.N5646d48585(i);
	    } 
	    return p;
	  }
	  static double N5646d48585(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 0.3274177981221131) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 0.3274177981221131) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N442a940386(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 4.505201784588776) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 4.505201784588776) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N475b73eb87(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= 2.330359011029437) {
	    p = SpeechDetector.N45176de688(i);
	    } else if (((Double) i[10]).doubleValue() > 2.330359011029437) {
	    p = SpeechDetector.N3484c229109(i);
	    } 
	    return p;
	  }
	  static double N45176de688(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 69.23974395782393) {
	    p = SpeechDetector.N5303a7a89(i);
	    } else if (((Double) i[0]).doubleValue() > 69.23974395782393) {
	    p = SpeechDetector.N38688aeb94(i);
	    } 
	    return p;
	  }
	  static double N5303a7a89(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 4.725669006743489) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 4.725669006743489) {
	    p = SpeechDetector.N214f223f90(i);
	    } 
	    return p;
	  }
	  static double N214f223f90(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 0.6579609828068526) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 0.6579609828068526) {
	    p = SpeechDetector.N5251672e91(i);
	    } 
	    return p;
	  }
	  static double N5251672e91(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -1.8511716899612138) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -1.8511716899612138) {
	    p = SpeechDetector.N5e4d273a92(i);
	    } 
	    return p;
	  }
	  static double N5e4d273a92(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 2.4936227112995537) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() > 2.4936227112995537) {
	    p = SpeechDetector.N1b4a813493(i);
	    } 
	    return p;
	  }
	  static double N1b4a813493(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 3.671180326032509) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 3.671180326032509) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N38688aeb94(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 0.8901860182710367) {
	    p = SpeechDetector.N5778673b95(i);
	    } else if (((Double) i[6]).doubleValue() > 0.8901860182710367) {
	    p = SpeechDetector.N1161fded105(i);
	    } 
	    return p;
	  }
	  static double N5778673b95(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 0.8761053824082026) {
	    p = SpeechDetector.N21c17f5a96(i);
	    } else if (((Double) i[2]).doubleValue() > 0.8761053824082026) {
	    p = SpeechDetector.N16cfb0799(i);
	    } 
	    return p;
	  }
	  static double N21c17f5a96(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 0.8029704015959608) {
	    p = SpeechDetector.N268fff0697(i);
	    } else if (((Double) i[11]).doubleValue() > 0.8029704015959608) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N268fff0697(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 72.45466289171279) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 72.45466289171279) {
	    p = SpeechDetector.N37aff6b198(i);
	    } 
	    return p;
	  }
	  static double N37aff6b198(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -1.6150916085555318) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -1.6150916085555318) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N16cfb0799(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 2.0413273305230812) {
	    p = SpeechDetector.N19d4894c100(i);
	    } else if (((Double) i[5]).doubleValue() > 2.0413273305230812) {
	    p = SpeechDetector.N6a3fe922103(i);
	    } 
	    return p;
	  }
	  static double N19d4894c100(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 0.41036495839728043) {
	    p = SpeechDetector.N5081e9d3101(i);
	    } else if (((Double) i[3]).doubleValue() > 0.41036495839728043) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5081e9d3101(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -0.4423215347249099) {
	    p = SpeechDetector.N11e44f0102(i);
	    } else if (((Double) i[10]).doubleValue() > -0.4423215347249099) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N11e44f0102(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -0.6414953545575287) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -0.6414953545575287) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6a3fe922103(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 4.475385529583018) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 4.475385529583018) {
	    p = SpeechDetector.N9e2edad104(i);
	    } 
	    return p;
	  }
	  static double N9e2edad104(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -1.6388856478944667) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -1.6388856478944667) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1161fded105(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 5.7749280447376306) {
	    p = SpeechDetector.N3865db85106(i);
	    } else if (((Double) i[2]).doubleValue() > 5.7749280447376306) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3865db85106(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 2.1220050462106705) {
	    p = SpeechDetector.N272f15b0107(i);
	    } else if (((Double) i[1]).doubleValue() > 2.1220050462106705) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N272f15b0107(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 74.48214207500017) {
	    p = SpeechDetector.N438e9e9108(i);
	    } else if (((Double) i[0]).doubleValue() > 74.48214207500017) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N438e9e9108(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -0.9318006265825611) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() > -0.9318006265825611) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3484c229109(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -0.39329983558531634) {
	    p = SpeechDetector.N77e72cae110(i);
	    } else if (((Double) i[8]).doubleValue() > -0.39329983558531634) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N77e72cae110(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -0.3983422967801838) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > -0.3983422967801838) {
	    p = SpeechDetector.N6a269101111(i);
	    } 
	    return p;
	  }
	  static double N6a269101111(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 69.93239391222036) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 69.93239391222036) {
	    p = SpeechDetector.N9fa0f19112(i);
	    } 
	    return p;
	  }
	  static double N9fa0f19112(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -1.737614553029507) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -1.737614553029507) {
	    p = SpeechDetector.N7ff5376c113(i);
	    } 
	    return p;
	  }
	  static double N7ff5376c113(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 4.700712196124954) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 4.700712196124954) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3c09d515114(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 0.18496909794396668) {
	    p = SpeechDetector.N2984747e115(i);
	    } else if (((Double) i[6]).doubleValue() > 0.18496909794396668) {
	    p = SpeechDetector.N151c2b4119(i);
	    } 
	    return p;
	  }
	  static double N2984747e115(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 67.23769974799785) {
	    p = SpeechDetector.N36fc117d116(i);
	    } else if (((Double) i[0]).doubleValue() > 67.23769974799785) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N36fc117d116(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= -1.9759689580512345) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > -1.9759689580512345) {
	    p = SpeechDetector.N5ee041be117(i);
	    } 
	    return p;
	  }
	  static double N5ee041be117(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 64.8850095033204) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 64.8850095033204) {
	    p = SpeechDetector.N54fc519b118(i);
	    } 
	    return p;
	  }
	  static double N54fc519b118(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 65.51211202869574) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 65.51211202869574) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N151c2b4119(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 62.292534943501884) {
	    p = SpeechDetector.N1ec5b819120(i);
	    } else if (((Double) i[0]).doubleValue() > 62.292534943501884) {
	    p = SpeechDetector.N46b98117121(i);
	    } 
	    return p;
	  }
	  static double N1ec5b819120(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 7.881340455510893) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 7.881340455510893) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N46b98117121(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 1.4167165678516047) {
	    p = SpeechDetector.N3cca3147122(i);
	    } else if (((Double) i[6]).doubleValue() > 1.4167165678516047) {
	    p = SpeechDetector.N7c9003aa126(i);
	    } 
	    return p;
	  }
	  static double N3cca3147122(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -0.5335638378599071) {
	    p = SpeechDetector.N7e694b7e123(i);
	    } else if (((Double) i[4]).doubleValue() > -0.5335638378599071) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7e694b7e123(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 7.761632903560315) {
	    p = SpeechDetector.N32db7e08124(i);
	    } else if (((Double) i[1]).doubleValue() > 7.761632903560315) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N32db7e08124(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 1.1690917671621996) {
	    p = SpeechDetector.N682f594d125(i);
	    } else if (((Double) i[9]).doubleValue() > 1.1690917671621996) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N682f594d125(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= 1.0571518145566012) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > 1.0571518145566012) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7c9003aa126(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 0.4076785137606301) {
	    p = SpeechDetector.N52e0cdc9127(i);
	    } else if (((Double) i[7]).doubleValue() > 0.4076785137606301) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N52e0cdc9127(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -1.5746065013784951) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -1.5746065013784951) {
	    p = SpeechDetector.N24e671a1128(i);
	    } 
	    return p;
	  }
	  static double N24e671a1128(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -1.5250914261114719) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -1.5250914261114719) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N152e13f4129(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -6.2295909706683394) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -6.2295909706683394) {
	    p = SpeechDetector.N4200309130(i);
	    } 
	    return p;
	  }
	  static double N4200309130(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -3.818738985435234) {
	    p = SpeechDetector.N51a745fc131(i);
	    } else if (((Double) i[9]).doubleValue() > -3.818738985435234) {
	    p = SpeechDetector.N5f47cab0139(i);
	    } 
	    return p;
	  }
	  static double N51a745fc131(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 1.2913289657767175) {
	    p = SpeechDetector.N3ce3cd45132(i);
	    } else if (((Double) i[2]).doubleValue() > 1.2913289657767175) {
	    p = SpeechDetector.N5ea64282134(i);
	    } 
	    return p;
	  }
	  static double N3ce3cd45132(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= 2.397652181199896) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() > 2.397652181199896) {
	    p = SpeechDetector.Nfb98c3e133(i);
	    } 
	    return p;
	  }
	  static double Nfb98c3e133(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= -3.3718328631870094) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() > -3.3718328631870094) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5ea64282134(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 3.736992735725128) {
	    p = SpeechDetector.N75589559135(i);
	    } else if (((Double) i[5]).doubleValue() > 3.736992735725128) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N75589559135(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -2.676965119514808) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -2.676965119514808) {
	    p = SpeechDetector.Nab5423f136(i);
	    } 
	    return p;
	  }
	  static double Nab5423f136(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 84.2735342736708) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 84.2735342736708) {
	    p = SpeechDetector.N2103b97137(i);
	    } 
	    return p;
	  }
	  static double N2103b97137(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 88.32587541651633) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 88.32587541651633) {
	    p = SpeechDetector.N77b8378f138(i);
	    } 
	    return p;
	  }
	  static double N77b8378f138(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -3.665141436919677) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -3.665141436919677) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5f47cab0139(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -2.865905441609534) {
	    p = SpeechDetector.N624c19ae140(i);
	    } else if (((Double) i[10]).doubleValue() > -2.865905441609534) {
	    p = SpeechDetector.N63c99db7148(i);
	    } 
	    return p;
	  }
	  static double N624c19ae140(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 2.4718708725470555) {
	    p = SpeechDetector.N722a20ec141(i);
	    } else if (((Double) i[2]).doubleValue() > 2.4718708725470555) {
	    p = SpeechDetector.N72cbe322144(i);
	    } 
	    return p;
	  }
	  static double N722a20ec141(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -0.28157014218260196) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -0.28157014218260196) {
	    p = SpeechDetector.N2bd7a082142(i);
	    } 
	    return p;
	  }
	  static double N2bd7a082142(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 3.212130719199208) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 3.212130719199208) {
	    p = SpeechDetector.N596acd4a143(i);
	    } 
	    return p;
	  }
	  static double N596acd4a143(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -4.384083765032243) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -4.384083765032243) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N72cbe322144(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -1.1716065295585176) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -1.1716065295585176) {
	    p = SpeechDetector.N27ad080f145(i);
	    } 
	    return p;
	  }
	  static double N27ad080f145(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -1.442934075650375) {
	    p = SpeechDetector.N50ec2522146(i);
	    } else if (((Double) i[4]).doubleValue() > -1.442934075650375) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N50ec2522146(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 90.64044459994561) {
	    p = SpeechDetector.N3f7a04af147(i);
	    } else if (((Double) i[0]).doubleValue() > 90.64044459994561) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3f7a04af147(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 4.157135208268646) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 4.157135208268646) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N63c99db7148(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= -0.3733169877759616) {
	    p = SpeechDetector.N49918c8f149(i);
	    } else if (((Double) i[7]).doubleValue() > -0.3733169877759616) {
	    p = SpeechDetector.N125797cf166(i);
	    } 
	    return p;
	  }
	  static double N49918c8f149(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -2.509237464385672) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -2.509237464385672) {
	    p = SpeechDetector.N72a32604150(i);
	    } 
	    return p;
	  }
	  static double N72a32604150(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -3.042640799390952) {
	    p = SpeechDetector.N35150b68151(i);
	    } else if (((Double) i[7]).doubleValue() > -3.042640799390952) {
	    p = SpeechDetector.N71f47f7a154(i);
	    } 
	    return p;
	  }
	  static double N35150b68151(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -1.4619780914521117) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -1.4619780914521117) {
	    p = SpeechDetector.N789ff411152(i);
	    } 
	    return p;
	  }
	  static double N789ff411152(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 80.39119460796257) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 80.39119460796257) {
	    p = SpeechDetector.N4d50c5f5153(i);
	    } 
	    return p;
	  }
	  static double N4d50c5f5153(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= -3.3115301913314665) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() > -3.3115301913314665) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N71f47f7a154(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -3.3192966249930462) {
	    p = SpeechDetector.N6add5d08155(i);
	    } else if (((Double) i[2]).doubleValue() > -3.3192966249930462) {
	    p = SpeechDetector.N6b06ef07156(i);
	    } 
	    return p;
	  }
	  static double N6add5d08155(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= -1.0411202457604476) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > -1.0411202457604476) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6b06ef07156(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -0.6465092368335925) {
	    p = SpeechDetector.N1436eb76157(i);
	    } else if (((Double) i[11]).doubleValue() > -0.6465092368335925) {
	    p = SpeechDetector.N6333934d164(i);
	    } 
	    return p;
	  }
	  static double N1436eb76157(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= -0.568881759314451) {
	    p = SpeechDetector.N219c9a58158(i);
	    } else if (((Double) i[4]).doubleValue() > -0.568881759314451) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N219c9a58158(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -1.963885314136682) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -1.963885314136682) {
	    p = SpeechDetector.N305918a5159(i);
	    } 
	    return p;
	  }
	  static double N305918a5159(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= -1.1569666368168439) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > -1.1569666368168439) {
	    p = SpeechDetector.N2961116f160(i);
	    } 
	    return p;
	  }
	  static double N2961116f160(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= -0.6126401784138628) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > -0.6126401784138628) {
	    p = SpeechDetector.N23bfa3a2161(i);
	    } 
	    return p;
	  }
	  static double N23bfa3a2161(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 5.192072940801426) {
	    p = SpeechDetector.N7a8ff303162(i);
	    } else if (((Double) i[2]).doubleValue() > 5.192072940801426) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7a8ff303162(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -0.3364526178788268) {
	    p = SpeechDetector.N9b88d2163(i);
	    } else if (((Double) i[6]).doubleValue() > -0.3364526178788268) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N9b88d2163(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -0.8191723800010965) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -0.8191723800010965) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6333934d164(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 3.4711509888362584) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > 3.4711509888362584) {
	    p = SpeechDetector.N4f0bd71c165(i);
	    } 
	    return p;
	  }
	  static double N4f0bd71c165(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 87.57269004327944) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 87.57269004327944) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N125797cf166(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= -0.4641586699379899) {
	    p = SpeechDetector.N34afa071167(i);
	    } else if (((Double) i[2]).doubleValue() > -0.4641586699379899) {
	    p = SpeechDetector.N29dd9285174(i);
	    } 
	    return p;
	  }
	  static double N34afa071167(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -2.6749598904050167) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -2.6749598904050167) {
	    p = SpeechDetector.N764e75bc168(i);
	    } 
	    return p;
	  }
	  static double N764e75bc168(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= -2.598979981483098) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > -2.598979981483098) {
	    p = SpeechDetector.N1913c652169(i);
	    } 
	    return p;
	  }
	  static double N1913c652169(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -1.9881895282349689) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -1.9881895282349689) {
	    p = SpeechDetector.N61413e5a170(i);
	    } 
	    return p;
	  }
	  static double N61413e5a170(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -2.2427449733404528) {
	    p = SpeechDetector.N264b898171(i);
	    } else if (((Double) i[8]).doubleValue() > -2.2427449733404528) {
	    p = SpeechDetector.N22930462172(i);
	    } 
	    return p;
	  }
	  static double N264b898171(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= -1.3975611547201494) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > -1.3975611547201494) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N22930462172(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 82.29615677924858) {
	    p = SpeechDetector.N6204cfa9173(i);
	    } else if (((Double) i[0]).doubleValue() > 82.29615677924858) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6204cfa9173(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 3.0845529301631522) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 3.0845529301631522) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N29dd9285174(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -2.6523814642512855) {
	    p = SpeechDetector.N11be6f3c175(i);
	    } else if (((Double) i[11]).doubleValue() > -2.6523814642512855) {
	    p = SpeechDetector.N36ca9a76181(i);
	    } 
	    return p;
	  }
	  static double N11be6f3c175(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 94.23396155213239) {
	    p = SpeechDetector.N6d78d53d176(i);
	    } else if (((Double) i[0]).doubleValue() > 94.23396155213239) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6d78d53d176(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 6.658395995819364) {
	    p = SpeechDetector.N17f7cff1177(i);
	    } else if (((Double) i[5]).doubleValue() > 6.658395995819364) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N17f7cff1177(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -2.2674386174765786) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > -2.2674386174765786) {
	    p = SpeechDetector.Ne74e382178(i);
	    } 
	    return p;
	  }
	  static double Ne74e382178(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 3.217472411656728) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 3.217472411656728) {
	    p = SpeechDetector.N1c047338179(i);
	    } 
	    return p;
	  }
	  static double N1c047338179(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 87.83256010216928) {
	    p = SpeechDetector.N68286fe6180(i);
	    } else if (((Double) i[0]).doubleValue() > 87.83256010216928) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N68286fe6180(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 6.805964157282519) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 6.805964157282519) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N36ca9a76181(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 80.65411575523191) {
	    p = SpeechDetector.N2f62d514182(i);
	    } else if (((Double) i[0]).doubleValue() > 80.65411575523191) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2f62d514182(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -1.2057021238504584) {
	    p = SpeechDetector.N1932c5a183(i);
	    } else if (((Double) i[4]).doubleValue() > -1.2057021238504584) {
	    p = SpeechDetector.N2d13b417186(i);
	    } 
	    return p;
	  }
	  static double N1932c5a183(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 1.2641043174122384) {
	    p = SpeechDetector.N6544c984184(i);
	    } else if (((Double) i[9]).doubleValue() > 1.2641043174122384) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6544c984184(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 0.6903626209677548) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 0.6903626209677548) {
	    p = SpeechDetector.N70a2d0d185(i);
	    } 
	    return p;
	  }
	  static double N70a2d0d185(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= -3.0104662571176863) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > -3.0104662571176863) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2d13b417186(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -1.7454907898277143) {
	    p = SpeechDetector.N6894691f187(i);
	    } else if (((Double) i[10]).doubleValue() > -1.7454907898277143) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6894691f187(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -2.0192049081760612) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -2.0192049081760612) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6781a7dc188(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= -5.8422624499519475) {
	    p = SpeechDetector.N7133919a189(i);
	    } else if (((Double) i[4]).doubleValue() > -5.8422624499519475) {
	    p = SpeechDetector.N2628de85191(i);
	    } 
	    return p;
	  }
	  static double N7133919a189(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 101.63813074906477) {
	    p = SpeechDetector.N709c4f85190(i);
	    } else if (((Double) i[0]).doubleValue() > 101.63813074906477) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N709c4f85190(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -0.3950448481564033) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -0.3950448481564033) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2628de85191(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= -2.57200796605346) {
	    p = SpeechDetector.N45290155192(i);
	    } else if (((Double) i[2]).doubleValue() > -2.57200796605346) {
	    p = SpeechDetector.N5c0e6396194(i);
	    } 
	    return p;
	  }
	  static double N45290155192(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -3.4334155616130917) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -3.4334155616130917) {
	    p = SpeechDetector.N71696ec193(i);
	    } 
	    return p;
	  }
	  static double N71696ec193(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -3.600226628147254) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -3.600226628147254) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5c0e6396194(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -4.17348429938563) {
	    p = SpeechDetector.N34ac3c11195(i);
	    } else if (((Double) i[10]).doubleValue() > -4.17348429938563) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N34ac3c11195(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -1.6834432164865432) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -1.6834432164865432) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N179b9b1b196(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 2.769320418776204) {
	    p = SpeechDetector.N68e415b8197(i);
	    } else if (((Double) i[9]).doubleValue() > 2.769320418776204) {
	    p = SpeechDetector.N675ad0c6448(i);
	    } 
	    return p;
	  }
	  static double N68e415b8197(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 3.052158894298982) {
	    p = SpeechDetector.N564e18d4198(i);
	    } else if (((Double) i[8]).doubleValue() > 3.052158894298982) {
	    p = SpeechDetector.N3f766af0423(i);
	    } 
	    return p;
	  }
	  static double N564e18d4198(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= -0.5314789196269927) {
	    p = SpeechDetector.N21403290199(i);
	    } else if (((Double) i[5]).doubleValue() > -0.5314789196269927) {
	    p = SpeechDetector.N4076a247262(i);
	    } 
	    return p;
	  }
	  static double N21403290199(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 57.534725754218606) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 57.534725754218606) {
	    p = SpeechDetector.N7db79cfd200(i);
	    } 
	    return p;
	  }
	  static double N7db79cfd200(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 81.97035313985805) {
	    p = SpeechDetector.N21a3e686201(i);
	    } else if (((Double) i[0]).doubleValue() > 81.97035313985805) {
	    p = SpeechDetector.N652489c0249(i);
	    } 
	    return p;
	  }
	  static double N21a3e686201(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 1.7305377623941465) {
	    p = SpeechDetector.Nf7378ab202(i);
	    } else if (((Double) i[4]).doubleValue() > 1.7305377623941465) {
	    p = SpeechDetector.N4594a0ad219(i);
	    } 
	    return p;
	  }
	  static double Nf7378ab202(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 60.782944030226936) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 60.782944030226936) {
	    p = SpeechDetector.N65f72a79203(i);
	    } 
	    return p;
	  }
	  static double N65f72a79203(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -1.5125817363557619) {
	    p = SpeechDetector.N4605a23b204(i);
	    } else if (((Double) i[5]).doubleValue() > -1.5125817363557619) {
	    p = SpeechDetector.N5143f787210(i);
	    } 
	    return p;
	  }
	  static double N4605a23b204(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 77.67365264415032) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 77.67365264415032) {
	    p = SpeechDetector.N1bddf367205(i);
	    } 
	    return p;
	  }
	  static double N1bddf367205(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -0.4834491951992766) {
	    p = SpeechDetector.N896fd7c206(i);
	    } else if (((Double) i[9]).doubleValue() > -0.4834491951992766) {
	    p = SpeechDetector.N746dbfb0209(i);
	    } 
	    return p;
	  }
	  static double N896fd7c206(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -0.21957141505583178) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -0.21957141505583178) {
	    p = SpeechDetector.N70dbdc4b207(i);
	    } 
	    return p;
	  }
	  static double N70dbdc4b207(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 1.5964741292559124) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 1.5964741292559124) {
	    p = SpeechDetector.N725bf9cf208(i);
	    } 
	    return p;
	  }
	  static double N725bf9cf208(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= -1.4160836359746316) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > -1.4160836359746316) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N746dbfb0209(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 3.755249237878459) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() > 3.755249237878459) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5143f787210(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= -0.33307965525952826) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > -0.33307965525952826) {
	    p = SpeechDetector.N452fe9bf211(i);
	    } 
	    return p;
	  }
	  static double N452fe9bf211(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -0.9316441689075419) {
	    p = SpeechDetector.N4c9b1e15212(i);
	    } else if (((Double) i[11]).doubleValue() > -0.9316441689075419) {
	    p = SpeechDetector.Nd78fb4216(i);
	    } 
	    return p;
	  }
	  static double N4c9b1e15212(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -0.18077007166402717) {
	    p = SpeechDetector.N5bd41bfd213(i);
	    } else if (((Double) i[10]).doubleValue() > -0.18077007166402717) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5bd41bfd213(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -0.9400154051326893) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -0.9400154051326893) {
	    p = SpeechDetector.N4279ae24214(i);
	    } 
	    return p;
	  }
	  static double N4279ae24214(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -0.511897995006727) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -0.511897995006727) {
	    p = SpeechDetector.N4297df94215(i);
	    } 
	    return p;
	  }
	  static double N4297df94215(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -2.187176558970757) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -2.187176558970757) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nd78fb4216(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 64.61777599321469) {
	    p = SpeechDetector.N481b72da217(i);
	    } else if (((Double) i[0]).doubleValue() > 64.61777599321469) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N481b72da217(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -0.4251920464424899) {
	    p = SpeechDetector.N2116b32218(i);
	    } else if (((Double) i[10]).doubleValue() > -0.4251920464424899) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2116b32218(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 0.5638840028946652) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 0.5638840028946652) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4594a0ad219(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -3.181177504077257) {
	    p = SpeechDetector.N20c0e18b220(i);
	    } else if (((Double) i[5]).doubleValue() > -3.181177504077257) {
	    p = SpeechDetector.N50e0de15228(i);
	    } 
	    return p;
	  }
	  static double N20c0e18b220(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= 2.944836564331462) {
	    p = SpeechDetector.N57177d79221(i);
	    } else if (((Double) i[10]).doubleValue() > 2.944836564331462) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N57177d79221(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 1.2214564436292779) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 1.2214564436292779) {
	    p = SpeechDetector.N472ebf9a222(i);
	    } 
	    return p;
	  }
	  static double N472ebf9a222(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 0.5936888667013629) {
	    p = SpeechDetector.N4e253bf8223(i);
	    } else if (((Double) i[8]).doubleValue() > 0.5936888667013629) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4e253bf8223(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= 0.3047099956865972) {
	    p = SpeechDetector.N6e843edc224(i);
	    } else if (((Double) i[11]).doubleValue() > 0.3047099956865972) {
	    p = SpeechDetector.N5b2e84f4226(i);
	    } 
	    return p;
	  }
	  static double N6e843edc224(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 1.860650494906991) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 1.860650494906991) {
	    p = SpeechDetector.N2c3b1633225(i);
	    } 
	    return p;
	  }
	  static double N2c3b1633225(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 65.9656500116912) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 65.9656500116912) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5b2e84f4226(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 3.0794642115319792) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 3.0794642115319792) {
	    p = SpeechDetector.N4b1addf0227(i);
	    } 
	    return p;
	  }
	  static double N4b1addf0227(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 69.54101348782106) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 69.54101348782106) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N50e0de15228(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 63.25797472922184) {
	    p = SpeechDetector.N5b145e2e229(i);
	    } else if (((Double) i[0]).doubleValue() > 63.25797472922184) {
	    p = SpeechDetector.N16334cb9230(i);
	    } 
	    return p;
	  }
	  static double N5b145e2e229(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 6.6843773299917615) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 6.6843773299917615) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N16334cb9230(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 8.502519938885222) {
	    p = SpeechDetector.N1f21112231(i);
	    } else if (((Double) i[2]).doubleValue() > 8.502519938885222) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1f21112231(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 2.231069055466423) {
	    p = SpeechDetector.N3b3eb5bd232(i);
	    } else if (((Double) i[1]).doubleValue() > 2.231069055466423) {
	    p = SpeechDetector.N149be3aa236(i);
	    } 
	    return p;
	  }
	  static double N3b3eb5bd232(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 74.11388001490221) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 74.11388001490221) {
	    p = SpeechDetector.N120da9ae233(i);
	    } 
	    return p;
	  }
	  static double N120da9ae233(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 3.1391394133790524) {
	    p = SpeechDetector.N3efee7c4234(i);
	    } else if (((Double) i[7]).doubleValue() > 3.1391394133790524) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3efee7c4234(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 2.9482518591107874) {
	    p = SpeechDetector.N5122152b235(i);
	    } else if (((Double) i[4]).doubleValue() > 2.9482518591107874) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5122152b235(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= -2.8443502357273216) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > -2.8443502357273216) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N149be3aa236(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 2.6091940003497) {
	    p = SpeechDetector.N67fb878237(i);
	    } else if (((Double) i[3]).doubleValue() > 2.6091940003497) {
	    p = SpeechDetector.N149d7837246(i);
	    } 
	    return p;
	  }
	  static double N67fb878237(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -3.4422554199375277) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -3.4422554199375277) {
	    p = SpeechDetector.N2b27d19d238(i);
	    } 
	    return p;
	  }
	  static double N2b27d19d238(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 4.286893387342226) {
	    p = SpeechDetector.N4332b08d239(i);
	    } else if (((Double) i[2]).doubleValue() > 4.286893387342226) {
	    p = SpeechDetector.N47f6b002245(i);
	    } 
	    return p;
	  }
	  static double N4332b08d239(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 1.2255062465648863) {
	    p = SpeechDetector.N34e51b72240(i);
	    } else if (((Double) i[2]).doubleValue() > 1.2255062465648863) {
	    p = SpeechDetector.N4b1a9732243(i);
	    } 
	    return p;
	  }
	  static double N34e51b72240(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 68.26807475128399) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 68.26807475128399) {
	    p = SpeechDetector.N2d6cf47f241(i);
	    } 
	    return p;
	  }
	  static double N2d6cf47f241(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 72.97968791524842) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 72.97968791524842) {
	    p = SpeechDetector.N4c27d525242(i);
	    } 
	    return p;
	  }
	  static double N4c27d525242(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 4.770626212669191) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 4.770626212669191) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4b1a9732243(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= -1.5282591104893413) {
	    p = SpeechDetector.N3ebc7a23244(i);
	    } else if (((Double) i[5]).doubleValue() > -1.5282591104893413) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3ebc7a23244(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 3.7552031981577034) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 3.7552031981577034) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N47f6b002245(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 1.112714023679374) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > 1.112714023679374) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N149d7837246(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 4.08701216869028) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 4.08701216869028) {
	    p = SpeechDetector.N6e3f6d73247(i);
	    } 
	    return p;
	  }
	  static double N6e3f6d73247(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -2.2777984766509327) {
	    p = SpeechDetector.N62ad191248(i);
	    } else if (((Double) i[8]).doubleValue() > -2.2777984766509327) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N62ad191248(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -0.6047097469098164) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -0.6047097469098164) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N652489c0249(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -4.135324117986614) {
	    p = SpeechDetector.N41cfd020250(i);
	    } else if (((Double) i[10]).doubleValue() > -4.135324117986614) {
	    p = SpeechDetector.Nd324de2252(i);
	    } 
	    return p;
	  }
	  static double N41cfd020250(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 85.57570441524153) {
	    p = SpeechDetector.N326906a1251(i);
	    } else if (((Double) i[0]).doubleValue() > 85.57570441524153) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N326906a1251(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 1.0192521561378702) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 1.0192521561378702) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nd324de2252(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 1.6830269286045487) {
	    p = SpeechDetector.N61973732253(i);
	    } else if (((Double) i[2]).doubleValue() > 1.6830269286045487) {
	    p = SpeechDetector.N7cc5a196260(i);
	    } 
	    return p;
	  }
	  static double N61973732253(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -3.281186164227825) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -3.281186164227825) {
	    p = SpeechDetector.Nea8e5ac254(i);
	    } 
	    return p;
	  }
	  static double Nea8e5ac254(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 98.63839141368895) {
	    p = SpeechDetector.N727e86b8255(i);
	    } else if (((Double) i[0]).doubleValue() > 98.63839141368895) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N727e86b8255(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 5.723063243469244) {
	    p = SpeechDetector.N50bed4c1256(i);
	    } else if (((Double) i[1]).doubleValue() > 5.723063243469244) {
	    p = SpeechDetector.N5bae0107259(i);
	    } 
	    return p;
	  }
	  static double N50bed4c1256(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 87.56990885827243) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 87.56990885827243) {
	    p = SpeechDetector.N2081f451257(i);
	    } 
	    return p;
	  }
	  static double N2081f451257(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 3.0046186898453193) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 3.0046186898453193) {
	    p = SpeechDetector.N33cf0283258(i);
	    } 
	    return p;
	  }
	  static double N33cf0283258(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -2.0832114415493663) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -2.0832114415493663) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5bae0107259(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 88.72228840572195) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 88.72228840572195) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7cc5a196260(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -4.072123967092482) {
	    p = SpeechDetector.N12f3bed9261(i);
	    } else if (((Double) i[5]).doubleValue() > -4.072123967092482) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N12f3bed9261(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -4.555323320742394) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > -4.555323320742394) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4076a247262(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 0.3185502647023922) {
	    p = SpeechDetector.N2c980461263(i);
	    } else if (((Double) i[2]).doubleValue() > 0.3185502647023922) {
	    p = SpeechDetector.N3ef29c65302(i);
	    } 
	    return p;
	  }
	  static double N2c980461263(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 66.2630402933266) {
	    p = SpeechDetector.N30479326264(i);
	    } else if (((Double) i[0]).doubleValue() > 66.2630402933266) {
	    p = SpeechDetector.N2b0dbc8d265(i);
	    } 
	    return p;
	  }
	  static double N30479326264(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 6.7015909481624) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 6.7015909481624) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2b0dbc8d265(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -1.7818645247589044) {
	    p = SpeechDetector.N12d5e310266(i);
	    } else if (((Double) i[6]).doubleValue() > -1.7818645247589044) {
	    p = SpeechDetector.N79bc8795276(i);
	    } 
	    return p;
	  }
	  static double N12d5e310266(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 99.3723110689581) {
	    p = SpeechDetector.N182e3919267(i);
	    } else if (((Double) i[0]).doubleValue() > 99.3723110689581) {
	    p = SpeechDetector.N27a5dac0275(i);
	    } 
	    return p;
	  }
	  static double N182e3919267(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 5.692004588942185) {
	    p = SpeechDetector.N2a6a4b6268(i);
	    } else if (((Double) i[4]).doubleValue() > 5.692004588942185) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2a6a4b6268(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -2.937339491623912) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -2.937339491623912) {
	    p = SpeechDetector.Na87aa16269(i);
	    } 
	    return p;
	  }
	  static double Na87aa16269(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -2.58787084536044) {
	    p = SpeechDetector.N50af8fc0270(i);
	    } else if (((Double) i[6]).doubleValue() > -2.58787084536044) {
	    p = SpeechDetector.N70f4d063272(i);
	    } 
	    return p;
	  }
	  static double N50af8fc0270(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 2.4598456234052066) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 2.4598456234052066) {
	    p = SpeechDetector.N3606afa2271(i);
	    } 
	    return p;
	  }
	  static double N3606afa2271(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 3.4035444681731932) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 3.4035444681731932) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N70f4d063272(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 2.5061643553585955) {
	    p = SpeechDetector.N589d4d84273(i);
	    } else if (((Double) i[3]).doubleValue() > 2.5061643553585955) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N589d4d84273(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 5.017557292700619) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 5.017557292700619) {
	    p = SpeechDetector.N3f4c428f274(i);
	    } 
	    return p;
	  }
	  static double N3f4c428f274(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 7.851565516539872) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 7.851565516539872) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N27a5dac0275(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 1.5877385534029613) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > 1.5877385534029613) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N79bc8795276(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -2.5314964106806292) {
	    p = SpeechDetector.N486985a3277(i);
	    } else if (((Double) i[9]).doubleValue() > -2.5314964106806292) {
	    p = SpeechDetector.N12eea1e7287(i);
	    } 
	    return p;
	  }
	  static double N486985a3277(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 1.8641697219329036) {
	    p = SpeechDetector.N7c4b579278(i);
	    } else if (((Double) i[3]).doubleValue() > 1.8641697219329036) {
	    p = SpeechDetector.N12c042ba284(i);
	    } 
	    return p;
	  }
	  static double N7c4b579278(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -3.6152087391657313) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() > -3.6152087391657313) {
	    p = SpeechDetector.N3661eeb279(i);
	    } 
	    return p;
	  }
	  static double N3661eeb279(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -0.4682661220170785) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -0.4682661220170785) {
	    p = SpeechDetector.N2577d80b280(i);
	    } 
	    return p;
	  }
	  static double N2577d80b280(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -1.5216574812814676) {
	    p = SpeechDetector.N5f08cd64281(i);
	    } else if (((Double) i[8]).doubleValue() > -1.5216574812814676) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5f08cd64281(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -2.611727104376451) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -2.611727104376451) {
	    p = SpeechDetector.N3ae490fa282(i);
	    } 
	    return p;
	  }
	  static double N3ae490fa282(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 88.70536039832872) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 88.70536039832872) {
	    p = SpeechDetector.N73ea2b4a283(i);
	    } 
	    return p;
	  }
	  static double N73ea2b4a283(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 5.342017165117748) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 5.342017165117748) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N12c042ba284(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -0.57762859408853) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() > -0.57762859408853) {
	    p = SpeechDetector.Nc5ccaf4285(i);
	    } 
	    return p;
	  }
	  static double Nc5ccaf4285(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 75.28841781442071) {
	    p = SpeechDetector.N20105f83286(i);
	    } else if (((Double) i[0]).doubleValue() > 75.28841781442071) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N20105f83286(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 3.7038299564256514) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 3.7038299564256514) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N12eea1e7287(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= 2.948089538072325) {
	    p = SpeechDetector.N70c74e66288(i);
	    } else if (((Double) i[10]).doubleValue() > 2.948089538072325) {
	    p = SpeechDetector.N3ae75147299(i);
	    } 
	    return p;
	  }
	  static double N70c74e66288(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= 0.7727064012422119) {
	    p = SpeechDetector.N2cec4462289(i);
	    } else if (((Double) i[11]).doubleValue() > 0.7727064012422119) {
	    p = SpeechDetector.N194f1541296(i);
	    } 
	    return p;
	  }
	  static double N2cec4462289(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 1.4695999312320758) {
	    p = SpeechDetector.N4b7d94f8290(i);
	    } else if (((Double) i[4]).doubleValue() > 1.4695999312320758) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4b7d94f8290(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 90.89146357271372) {
	    p = SpeechDetector.N21bf4c80291(i);
	    } else if (((Double) i[0]).doubleValue() > 90.89146357271372) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N21bf4c80291(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 0.39949965798980913) {
	    p = SpeechDetector.N163778cf292(i);
	    } else if (((Double) i[6]).doubleValue() > 0.39949965798980913) {
	    p = SpeechDetector.N6b8dbef1294(i);
	    } 
	    return p;
	  }
	  static double N163778cf292(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 1.1727758119869887) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 1.1727758119869887) {
	    p = SpeechDetector.N13dc696e293(i);
	    } 
	    return p;
	  }
	  static double N13dc696e293(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 2.8392026532753984) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 2.8392026532753984) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6b8dbef1294(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 68.4916447400047) {
	    p = SpeechDetector.N26f2f761295(i);
	    } else if (((Double) i[0]).doubleValue() > 68.4916447400047) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N26f2f761295(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 5.671604802462336) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 5.671604802462336) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N194f1541296(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 71.64637559575984) {
	    p = SpeechDetector.N16fc6b62297(i);
	    } else if (((Double) i[0]).doubleValue() > 71.64637559575984) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N16fc6b62297(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 0.9927230265558387) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 0.9927230265558387) {
	    p = SpeechDetector.N15edfab8298(i);
	    } 
	    return p;
	  }
	  static double N15edfab8298(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 3.135305660550441) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 3.135305660550441) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3ae75147299(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 2.939046972856933) {
	    p = SpeechDetector.N28892a87300(i);
	    } else if (((Double) i[4]).doubleValue() > 2.939046972856933) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N28892a87300(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 76.375310868872) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 76.375310868872) {
	    p = SpeechDetector.N454719db301(i);
	    } 
	    return p;
	  }
	  static double N454719db301(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 77.83233979208215) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 77.83233979208215) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3ef29c65302(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 76.18320519032493) {
	    p = SpeechDetector.N29f9cb2c303(i);
	    } else if (((Double) i[0]).doubleValue() > 76.18320519032493) {
	    p = SpeechDetector.N620369bb412(i);
	    } 
	    return p;
	  }
	  static double N29f9cb2c303(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 3.060651777734391) {
	    p = SpeechDetector.N4e89cb3b304(i);
	    } else if (((Double) i[7]).doubleValue() > 3.060651777734391) {
	    p = SpeechDetector.N7cb523dc391(i);
	    } 
	    return p;
	  }
	  static double N4e89cb3b304(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 3.502446709611718) {
	    p = SpeechDetector.N387db6c5305(i);
	    } else if (((Double) i[1]).doubleValue() > 3.502446709611718) {
	    p = SpeechDetector.N52ac5024315(i);
	    } 
	    return p;
	  }
	  static double N387db6c5305(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 70.02559866837608) {
	    p = SpeechDetector.N456a5c7c306(i);
	    } else if (((Double) i[0]).doubleValue() > 70.02559866837608) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N456a5c7c306(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 56.89309040911123) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 56.89309040911123) {
	    p = SpeechDetector.N49ddf47e307(i);
	    } 
	    return p;
	  }
	  static double N49ddf47e307(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 65.19854141405236) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 65.19854141405236) {
	    p = SpeechDetector.Nadea215308(i);
	    } 
	    return p;
	  }
	  static double Nadea215308(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 1.5223260381255015) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 1.5223260381255015) {
	    p = SpeechDetector.N1e631646309(i);
	    } 
	    return p;
	  }
	  static double N1e631646309(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 1.9892011882287697) {
	    p = SpeechDetector.N7b4b5d3f310(i);
	    } else if (((Double) i[5]).doubleValue() > 1.9892011882287697) {
	    p = SpeechDetector.N4abad094313(i);
	    } 
	    return p;
	  }
	  static double N7b4b5d3f310(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 1.3246075647786715) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > 1.3246075647786715) {
	    p = SpeechDetector.N10d71256311(i);
	    } 
	    return p;
	  }
	  static double N10d71256311(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 3.076370522207581) {
	    p = SpeechDetector.N17f4d4bd312(i);
	    } else if (((Double) i[3]).doubleValue() > 3.076370522207581) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N17f4d4bd312(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 2.589752626509214) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 2.589752626509214) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4abad094313(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 0.6768305392973186) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > 0.6768305392973186) {
	    p = SpeechDetector.N2ed3cae0314(i);
	    } 
	    return p;
	  }
	  static double N2ed3cae0314(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 4.430776910924229) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 4.430776910924229) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N52ac5024315(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 1.7491118237297778) {
	    p = SpeechDetector.N2ec195e3316(i);
	    } else if (((Double) i[4]).doubleValue() > 1.7491118237297778) {
	    p = SpeechDetector.N6db17b38357(i);
	    } 
	    return p;
	  }
	  static double N2ec195e3316(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 57.65643247793781) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 57.65643247793781) {
	    p = SpeechDetector.N27578210317(i);
	    } 
	    return p;
	  }
	  static double N27578210317(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 61.310174990541945) {
	    p = SpeechDetector.N621bfc9d318(i);
	    } else if (((Double) i[0]).doubleValue() > 61.310174990541945) {
	    p = SpeechDetector.N4cb1843a326(i);
	    } 
	    return p;
	  }
	  static double N621bfc9d318(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 7.0029791901574026) {
	    p = SpeechDetector.N1b65d9bd319(i);
	    } else if (((Double) i[1]).doubleValue() > 7.0029791901574026) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1b65d9bd319(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 3.843408957206286) {
	    p = SpeechDetector.N3bba1558320(i);
	    } else if (((Double) i[3]).doubleValue() > 3.843408957206286) {
	    p = SpeechDetector.N6f6acce3325(i);
	    } 
	    return p;
	  }
	  static double N3bba1558320(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 58.417476006848986) {
	    p = SpeechDetector.N35cf630a321(i);
	    } else if (((Double) i[0]).doubleValue() > 58.417476006848986) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N35cf630a321(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 4.104421910030837) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 4.104421910030837) {
	    p = SpeechDetector.N426f411f322(i);
	    } 
	    return p;
	  }
	  static double N426f411f322(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= 1.8581905671921155) {
	    p = SpeechDetector.N161c7c4c323(i);
	    } else if (((Double) i[11]).doubleValue() > 1.8581905671921155) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N161c7c4c323(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 1.9531812728891507) {
	    p = SpeechDetector.N28246ceb324(i);
	    } else if (((Double) i[5]).doubleValue() > 1.9531812728891507) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N28246ceb324(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 0.1431958355419023) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > 0.1431958355419023) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6f6acce3325(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 6.295365409430153) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 6.295365409430153) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4cb1843a326(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -1.3857734711755805) {
	    p = SpeechDetector.N1a60232c327(i);
	    } else if (((Double) i[6]).doubleValue() > -1.3857734711755805) {
	    p = SpeechDetector.N4a4cfc65336(i);
	    } 
	    return p;
	  }
	  static double N1a60232c327(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -2.0056720236030423) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() > -2.0056720236030423) {
	    p = SpeechDetector.N1da52b3b328(i);
	    } 
	    return p;
	  }
	  static double N1da52b3b328(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 0.08195273328127871) {
	    p = SpeechDetector.N46b93db1329(i);
	    } else if (((Double) i[9]).doubleValue() > 0.08195273328127871) {
	    p = SpeechDetector.N4db9bbf6334(i);
	    } 
	    return p;
	  }
	  static double N46b93db1329(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= 1.507912888090313) {
	    p = SpeechDetector.N2b8153bd330(i);
	    } else if (((Double) i[10]).doubleValue() > 1.507912888090313) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2b8153bd330(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -2.5680811904103407) {
	    p = SpeechDetector.N37a0b39b331(i);
	    } else if (((Double) i[8]).doubleValue() > -2.5680811904103407) {
	    p = SpeechDetector.N176fa1a5332(i);
	    } 
	    return p;
	  }
	  static double N37a0b39b331(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 70.55527211647414) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 70.55527211647414) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N176fa1a5332(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 1.133093563401365) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 1.133093563401365) {
	    p = SpeechDetector.N21dd63a8333(i);
	    } 
	    return p;
	  }
	  static double N21dd63a8333(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 7.0631752137919515) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 7.0631752137919515) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4db9bbf6334(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= -0.8264593387240333) {
	    p = SpeechDetector.N5ce33b57335(i);
	    } else if (((Double) i[7]).doubleValue() > -0.8264593387240333) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5ce33b57335(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -2.5204854098174456) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > -2.5204854098174456) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4a4cfc65336(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 0.964636540592882) {
	    p = SpeechDetector.N44e70ff337(i);
	    } else if (((Double) i[8]).doubleValue() > 0.964636540592882) {
	    p = SpeechDetector.N4c47e8f3349(i);
	    } 
	    return p;
	  }
	  static double N44e70ff337(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 61.694281217798284) {
	    p = SpeechDetector.N39dc778e338(i);
	    } else if (((Double) i[0]).doubleValue() > 61.694281217798284) {
	    p = SpeechDetector.Ne6f205e341(i);
	    } 
	    return p;
	  }
	  static double N39dc778e338(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 2.7302807238678146) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 2.7302807238678146) {
	    p = SpeechDetector.N392d294f339(i);
	    } 
	    return p;
	  }
	  static double N392d294f339(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 0.1676301565405106) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > 0.1676301565405106) {
	    p = SpeechDetector.N43f31edc340(i);
	    } 
	    return p;
	  }
	  static double N43f31edc340(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 61.461522795667314) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 61.461522795667314) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Ne6f205e341(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 0.7017212737002652) {
	    p = SpeechDetector.N21b602b9342(i);
	    } else if (((Double) i[5]).doubleValue() > 0.7017212737002652) {
	    p = SpeechDetector.N540ba652344(i);
	    } 
	    return p;
	  }
	  static double N21b602b9342(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -2.85576356676925) {
	    p = SpeechDetector.N346cd0f9343(i);
	    } else if (((Double) i[10]).doubleValue() > -2.85576356676925) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N346cd0f9343(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 65.51601487232895) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 65.51601487232895) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N540ba652344(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= -1.613357084356039) {
	    p = SpeechDetector.N48d47c99345(i);
	    } else if (((Double) i[9]).doubleValue() > -1.613357084356039) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N48d47c99345(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -0.5795081798293482) {
	    p = SpeechDetector.N76404629346(i);
	    } else if (((Double) i[11]).doubleValue() > -0.5795081798293482) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N76404629346(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 0.5815196735070276) {
	    p = SpeechDetector.N75be6a65347(i);
	    } else if (((Double) i[7]).doubleValue() > 0.5815196735070276) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N75be6a65347(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -1.538766041618848) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -1.538766041618848) {
	    p = SpeechDetector.N283b4947348(i);
	    } 
	    return p;
	  }
	  static double N283b4947348(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 4.375893652892044) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > 4.375893652892044) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4c47e8f3349(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= 0.17308400595003043) {
	    p = SpeechDetector.N50ed0a5350(i);
	    } else if (((Double) i[10]).doubleValue() > 0.17308400595003043) {
	    p = SpeechDetector.N58d01e82352(i);
	    } 
	    return p;
	  }
	  static double N50ed0a5350(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= 0.26260595916631707) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() > 0.26260595916631707) {
	    p = SpeechDetector.Nfa4033b351(i);
	    } 
	    return p;
	  }
	  static double Nfa4033b351(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 63.68369859920916) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 63.68369859920916) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N58d01e82352(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 62.89362395590647) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 62.89362395590647) {
	    p = SpeechDetector.N4783165b353(i);
	    } 
	    return p;
	  }
	  static double N4783165b353(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 3.665229139099261) {
	    p = SpeechDetector.N6f30d50a354(i);
	    } else if (((Double) i[3]).doubleValue() > 3.665229139099261) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6f30d50a354(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 5.145878145408453) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 5.145878145408453) {
	    p = SpeechDetector.N6ef2bc8d355(i);
	    } 
	    return p;
	  }
	  static double N6ef2bc8d355(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= 1.73669417337345) {
	    p = SpeechDetector.N23905e3356(i);
	    } else if (((Double) i[8]).doubleValue() > 1.73669417337345) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N23905e3356(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= 2.3016093147857717) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() > 2.3016093147857717) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6db17b38357(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= -2.19036973280208) {
	    p = SpeechDetector.N1f10d1cb358(i);
	    } else if (((Double) i[6]).doubleValue() > -2.19036973280208) {
	    p = SpeechDetector.N70eaa683363(i);
	    } 
	    return p;
	  }
	  static double N1f10d1cb358(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -3.9869702374820366) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() > -3.9869702374820366) {
	    p = SpeechDetector.N93d765c359(i);
	    } 
	    return p;
	  }
	  static double N93d765c359(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -3.1952956537792727) {
	    p = SpeechDetector.N222596c1360(i);
	    } else if (((Double) i[6]).doubleValue() > -3.1952956537792727) {
	    p = SpeechDetector.N435e7f1a362(i);
	    } 
	    return p;
	  }
	  static double N222596c1360(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 0.9117093500698957) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > 0.9117093500698957) {
	    p = SpeechDetector.N51cc6a6a361(i);
	    } 
	    return p;
	  }
	  static double N51cc6a6a361(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 3.812477898790031) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 3.812477898790031) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N435e7f1a362(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 63.88885111662758) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 63.88885111662758) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N70eaa683363(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 2.7778932023985465) {
	    p = SpeechDetector.N3d5a1c5f364(i);
	    } else if (((Double) i[3]).doubleValue() > 2.7778932023985465) {
	    p = SpeechDetector.N7daed910381(i);
	    } 
	    return p;
	  }
	  static double N3d5a1c5f364(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 57.56369621572358) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 57.56369621572358) {
	    p = SpeechDetector.N66fcc070365(i);
	    } 
	    return p;
	  }
	  static double N66fcc070365(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 61.94146165976098) {
	    p = SpeechDetector.N5bbe2de2366(i);
	    } else if (((Double) i[0]).doubleValue() > 61.94146165976098) {
	    p = SpeechDetector.N7f08d052372(i);
	    } 
	    return p;
	  }
	  static double N5bbe2de2366(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 58.556671757338904) {
	    p = SpeechDetector.N22b67f7c367(i);
	    } else if (((Double) i[0]).doubleValue() > 58.556671757338904) {
	    p = SpeechDetector.N5ce904c4369(i);
	    } 
	    return p;
	  }
	  static double N22b67f7c367(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 4.446179268732511) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 4.446179268732511) {
	    p = SpeechDetector.N7b6bb7b1368(i);
	    } 
	    return p;
	  }
	  static double N7b6bb7b1368(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 0.01237121615385799) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 0.01237121615385799) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5ce904c4369(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 6.9891825700867) {
	    p = SpeechDetector.N46380f83370(i);
	    } else if (((Double) i[1]).doubleValue() > 6.9891825700867) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N46380f83370(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 2.467430878240291) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 2.467430878240291) {
	    p = SpeechDetector.Na828579371(i);
	    } 
	    return p;
	  }
	  static double Na828579371(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 6.203422498655311) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 6.203422498655311) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7f08d052372(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= -2.466258046495194) {
	    p = SpeechDetector.N1ba4f8a6373(i);
	    } else if (((Double) i[7]).doubleValue() > -2.466258046495194) {
	    p = SpeechDetector.N6bc06877374(i);
	    } 
	    return p;
	  }
	  static double N1ba4f8a6373(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 0.5570420926084305) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > 0.5570420926084305) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6bc06877374(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 6.088198095653105) {
	    p = SpeechDetector.N250a93e5375(i);
	    } else if (((Double) i[1]).doubleValue() > 6.088198095653105) {
	    p = SpeechDetector.N36054f2d378(i);
	    } 
	    return p;
	  }
	  static double N250a93e5375(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 63.98290698357974) {
	    p = SpeechDetector.N5973b262376(i);
	    } else if (((Double) i[0]).doubleValue() > 63.98290698357974) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5973b262376(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 2.94098774886856) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 2.94098774886856) {
	    p = SpeechDetector.N3ac46dcf377(i);
	    } 
	    return p;
	  }
	  static double N3ac46dcf377(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 1.1745721538586784) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 1.1745721538586784) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N36054f2d378(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= -0.2785931405303359) {
	    p = SpeechDetector.N16912f10379(i);
	    } else if (((Double) i[3]).doubleValue() > -0.2785931405303359) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N16912f10379(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 2.9369205226478163) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() > 2.9369205226478163) {
	    p = SpeechDetector.N15a8cf03380(i);
	    } 
	    return p;
	  }
	  static double N15a8cf03380(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 70.4124048869943) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 70.4124048869943) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7daed910381(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 5.939276114858004) {
	    p = SpeechDetector.N622ce9e6382(i);
	    } else if (((Double) i[1]).doubleValue() > 5.939276114858004) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N622ce9e6382(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 57.331380138227786) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 57.331380138227786) {
	    p = SpeechDetector.N72b02d64383(i);
	    } 
	    return p;
	  }
	  static double N72b02d64383(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 62.859570355747195) {
	    p = SpeechDetector.Nc743b0f384(i);
	    } else if (((Double) i[0]).doubleValue() > 62.859570355747195) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nc743b0f384(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 4.617090244571232) {
	    p = SpeechDetector.N22d15c2c385(i);
	    } else if (((Double) i[2]).doubleValue() > 4.617090244571232) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N22d15c2c385(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 1.601503649761805) {
	    p = SpeechDetector.N5efa5e8f386(i);
	    } else if (((Double) i[6]).doubleValue() > 1.601503649761805) {
	    p = SpeechDetector.N39bf4c57389(i);
	    } 
	    return p;
	  }
	  static double N5efa5e8f386(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 0.43231563315089677) {
	    p = SpeechDetector.N7562f00387(i);
	    } else if (((Double) i[8]).doubleValue() > 0.43231563315089677) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7562f00387(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 3.6076273081252106) {
	    p = SpeechDetector.N2b27acc3388(i);
	    } else if (((Double) i[2]).doubleValue() > 3.6076273081252106) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2b27acc3388(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 3.3966369526987923) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() > 3.3966369526987923) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N39bf4c57389(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 1.0334128457844434) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > 1.0334128457844434) {
	    p = SpeechDetector.N3e2d015f390(i);
	    } 
	    return p;
	  }
	  static double N3e2d015f390(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 58.13474594809181) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 58.13474594809181) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7cb523dc391(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 57.51154202420308) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 57.51154202420308) {
	    p = SpeechDetector.N5845807a392(i);
	    } 
	    return p;
	  }
	  static double N5845807a392(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 3.3072132837950226) {
	    p = SpeechDetector.N3af5f6dc393(i);
	    } else if (((Double) i[3]).doubleValue() > 3.3072132837950226) {
	    p = SpeechDetector.Ne2bf6c0407(i);
	    } 
	    return p;
	  }
	  static double N3af5f6dc393(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 62.98654628336695) {
	    p = SpeechDetector.N6a2203c1394(i);
	    } else if (((Double) i[0]).doubleValue() > 62.98654628336695) {
	    p = SpeechDetector.N2b88689a400(i);
	    } 
	    return p;
	  }
	  static double N6a2203c1394(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 6.798182525051889) {
	    p = SpeechDetector.N5f24aa56395(i);
	    } else if (((Double) i[1]).doubleValue() > 6.798182525051889) {
	    p = SpeechDetector.N6a712a2e399(i);
	    } 
	    return p;
	  }
	  static double N5f24aa56395(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 58.30645633207467) {
	    p = SpeechDetector.N602b24e6396(i);
	    } else if (((Double) i[0]).doubleValue() > 58.30645633207467) {
	    p = SpeechDetector.N3083a95d397(i);
	    } 
	    return p;
	  }
	  static double N602b24e6396(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 4.692293445872883) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 4.692293445872883) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3083a95d397(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -1.492043975668889) {
	    p = SpeechDetector.N13e4318d398(i);
	    } else if (((Double) i[10]).doubleValue() > -1.492043975668889) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N13e4318d398(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 6.059759868368689) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 6.059759868368689) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6a712a2e399(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 60.737707548444085) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 60.737707548444085) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2b88689a400(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 4.333076857077861) {
	    p = SpeechDetector.N88b6cca401(i);
	    } else if (((Double) i[1]).doubleValue() > 4.333076857077861) {
	    p = SpeechDetector.N7621c3b0404(i);
	    } 
	    return p;
	  }
	  static double N88b6cca401(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 70.04199970623361) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 70.04199970623361) {
	    p = SpeechDetector.N79934627402(i);
	    } 
	    return p;
	  }
	  static double N79934627402(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 1.2777837014117068) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 1.2777837014117068) {
	    p = SpeechDetector.N33e2e8cc403(i);
	    } 
	    return p;
	  }
	  static double N33e2e8cc403(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -2.7947567797741315) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -2.7947567797741315) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7621c3b0404(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 0.43008043769108223) {
	    p = SpeechDetector.N22b69467405(i);
	    } else if (((Double) i[3]).doubleValue() > 0.43008043769108223) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N22b69467405(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 2.1042296900545243) {
	    p = SpeechDetector.Nc907ff406(i);
	    } else if (((Double) i[6]).doubleValue() > 2.1042296900545243) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nc907ff406(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 2.6560054499639936) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 2.6560054499639936) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Ne2bf6c0407(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 5.177933510113657) {
	    p = SpeechDetector.N6854be84408(i);
	    } else if (((Double) i[1]).doubleValue() > 5.177933510113657) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6854be84408(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 71.07532574812497) {
	    p = SpeechDetector.N13a8019f409(i);
	    } else if (((Double) i[0]).doubleValue() > 71.07532574812497) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N13a8019f409(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 0.3922134006744233) {
	    p = SpeechDetector.N7b0277cd410(i);
	    } else if (((Double) i[9]).doubleValue() > 0.3922134006744233) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N7b0277cd410(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= -0.7297516792525061) {
	    p = SpeechDetector.N5f0772d2411(i);
	    } else if (((Double) i[9]).doubleValue() > -0.7297516792525061) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5f0772d2411(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 64.34232767120784) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 64.34232767120784) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N620369bb412(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= -0.7897493605706625) {
	    p = SpeechDetector.N4e12a642413(i);
	    } else if (((Double) i[3]).doubleValue() > -0.7897493605706625) {
	    p = SpeechDetector.Neca5a40419(i);
	    } 
	    return p;
	  }
	  static double N4e12a642413(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -0.7607256531290547) {
	    p = SpeechDetector.N2a615f19414(i);
	    } else if (((Double) i[6]).doubleValue() > -0.7607256531290547) {
	    p = SpeechDetector.N53533ff4417(i);
	    } 
	    return p;
	  }
	  static double N2a615f19414(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -2.694966800703548) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() > -2.694966800703548) {
	    p = SpeechDetector.N5eaa780b415(i);
	    } 
	    return p;
	  }
	  static double N5eaa780b415(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 0.3850005710813863) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() > 0.3850005710813863) {
	    p = SpeechDetector.N9af4abb416(i);
	    } 
	    return p;
	  }
	  static double N9af4abb416(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() <= 1.3821889374107708) {
	      p = 1;
	    } else if (((Double) i[4]).doubleValue() > 1.3821889374107708) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N53533ff4417(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 0;
	    } else if (((Double) i[11]).doubleValue() <= -4.197129387019373) {
	    p = SpeechDetector.N7e8bd6e8418(i);
	    } else if (((Double) i[11]).doubleValue() > -4.197129387019373) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N7e8bd6e8418(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 1.8880125807067594) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > 1.8880125807067594) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Neca5a40419(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -4.897778097466316) {
	    p = SpeechDetector.N6eb2756420(i);
	    } else if (((Double) i[8]).doubleValue() > -4.897778097466316) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6eb2756420(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= 1.8098910501843057) {
	    p = SpeechDetector.N386382a6421(i);
	    } else if (((Double) i[11]).doubleValue() > 1.8098910501843057) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N386382a6421(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 1.371946273042927) {
	    p = SpeechDetector.Nd167d36422(i);
	    } else if (((Double) i[5]).doubleValue() > 1.371946273042927) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double Nd167d36422(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 86.74298049870657) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 86.74298049870657) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3f766af0423(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 57.61956667725784) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() > 57.61956667725784) {
	    p = SpeechDetector.N7766d31c424(i);
	    } 
	    return p;
	  }
	  static double N7766d31c424(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 70.7031608907433) {
	    p = SpeechDetector.N7fae1081425(i);
	    } else if (((Double) i[0]).doubleValue() > 70.7031608907433) {
	    p = SpeechDetector.N6350152f438(i);
	    } 
	    return p;
	  }
	  static double N7fae1081425(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 6.670295169811004) {
	    p = SpeechDetector.N7cbdc6a3426(i);
	    } else if (((Double) i[1]).doubleValue() > 6.670295169811004) {
	    p = SpeechDetector.N20986975435(i);
	    } 
	    return p;
	  }
	  static double N7cbdc6a3426(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 3.239427054463045) {
	    p = SpeechDetector.Nf3c3750427(i);
	    } else if (((Double) i[3]).doubleValue() > 3.239427054463045) {
	    p = SpeechDetector.N74e7a8f5430(i);
	    } 
	    return p;
	  }
	  static double Nf3c3750427(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -0.9081589548051707) {
	    p = SpeechDetector.N3a536d00428(i);
	    } else if (((Double) i[10]).doubleValue() > -0.9081589548051707) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N3a536d00428(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 2.4138156993550774) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 2.4138156993550774) {
	    p = SpeechDetector.N3b1938ea429(i);
	    } 
	    return p;
	  }
	  static double N3b1938ea429(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 66.18490297579706) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 66.18490297579706) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N74e7a8f5430(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 3.6952622610441543) {
	    p = SpeechDetector.N1505a8c9431(i);
	    } else if (((Double) i[2]).doubleValue() > 3.6952622610441543) {
	    p = SpeechDetector.N36c48772434(i);
	    } 
	    return p;
	  }
	  static double N1505a8c9431(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 2.6634744947434017) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 2.6634744947434017) {
	    p = SpeechDetector.N268c2ee7432(i);
	    } 
	    return p;
	  }
	  static double N268c2ee7432(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= -0.41647509357574874) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() > -0.41647509357574874) {
	    p = SpeechDetector.N3d5b5376433(i);
	    } 
	    return p;
	  }
	  static double N3d5b5376433(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 2.426449481207055) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 2.426449481207055) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N36c48772434(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 0.00789671048729511) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 0.00789671048729511) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N20986975435(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 1.9044568712391492) {
	    p = SpeechDetector.N7633910a436(i);
	    } else if (((Double) i[3]).doubleValue() > 1.9044568712391492) {
	    p = SpeechDetector.N33776426437(i);
	    } 
	    return p;
	  }
	  static double N7633910a436(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 2.3350035892912775) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > 2.3350035892912775) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N33776426437(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -1.3837586171735585) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -1.3837586171735585) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6350152f438(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -0.6291737945424698) {
	    p = SpeechDetector.N1e9ef399439(i);
	    } else if (((Double) i[5]).doubleValue() > -0.6291737945424698) {
	    p = SpeechDetector.N59e96ffd442(i);
	    } 
	    return p;
	  }
	  static double N1e9ef399439(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -1.0971752087930173) {
	    p = SpeechDetector.N558ad183440(i);
	    } else if (((Double) i[10]).doubleValue() > -1.0971752087930173) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N558ad183440(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 1.7406034286615895) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 1.7406034286615895) {
	    p = SpeechDetector.Ncc11b55441(i);
	    } 
	    return p;
	  }
	  static double Ncc11b55441(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 76.179899860787) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 76.179899860787) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N59e96ffd442(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 0.4970855868966868) {
	    p = SpeechDetector.N6cb77928443(i);
	    } else if (((Double) i[2]).doubleValue() > 0.4970855868966868) {
	    p = SpeechDetector.N5aaa2ee4446(i);
	    } 
	    return p;
	  }
	  static double N6cb77928443(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 4.015722629947571) {
	    p = SpeechDetector.N17368db444(i);
	    } else if (((Double) i[7]).doubleValue() > 4.015722629947571) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N17368db444(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -1.4914835785747116) {
	    p = SpeechDetector.N3fe9029b445(i);
	    } else if (((Double) i[10]).doubleValue() > -1.4914835785747116) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3fe9029b445(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= -1.9276693457001515) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() > -1.9276693457001515) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N5aaa2ee4446(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -3.83034563698234) {
	    p = SpeechDetector.N5aeca93c447(i);
	    } else if (((Double) i[6]).doubleValue() > -3.83034563698234) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5aeca93c447(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 90.25566005586805) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 90.25566005586805) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N675ad0c6448(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 57.60032243722826) {
	    p = SpeechDetector.N7b40ac2c449(i);
	    } else if (((Double) i[0]).doubleValue() > 57.60032243722826) {
	    p = SpeechDetector.N2f405ea9457(i);
	    } 
	    return p;
	  }
	  static double N7b40ac2c449(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 4.136590866206488) {
	    p = SpeechDetector.N52e7bbeb450(i);
	    } else if (((Double) i[1]).doubleValue() > 4.136590866206488) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N52e7bbeb450(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 57.14665895354479) {
	    p = SpeechDetector.N6be26bd2451(i);
	    } else if (((Double) i[0]).doubleValue() > 57.14665895354479) {
	    p = SpeechDetector.N48ba0f44456(i);
	    } 
	    return p;
	  }
	  static double N6be26bd2451(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 4.067609973089477) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() > 4.067609973089477) {
	    p = SpeechDetector.N5e14df53452(i);
	    } 
	    return p;
	  }
	  static double N5e14df53452(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= 1.2827450374973464) {
	    p = SpeechDetector.N2c51f266453(i);
	    } else if (((Double) i[10]).doubleValue() > 1.2827450374973464) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2c51f266453(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 1;
	    } else if (((Double) i[3]).doubleValue() <= 2.424637896430134) {
	    p = SpeechDetector.N38011d45454(i);
	    } else if (((Double) i[3]).doubleValue() > 2.424637896430134) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N38011d45454(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 56.142183337961114) {
	    p = SpeechDetector.N5128b9bc455(i);
	    } else if (((Double) i[0]).doubleValue() > 56.142183337961114) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5128b9bc455(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 2.3966333836032665) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 2.3966333836032665) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N48ba0f44456(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 3.8010252263928423) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 3.8010252263928423) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2f405ea9457(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 69.69013190800409) {
	    p = SpeechDetector.N2b06c17b458(i);
	    } else if (((Double) i[0]).doubleValue() > 69.69013190800409) {
	    p = SpeechDetector.N25b217f6487(i);
	    } 
	    return p;
	  }
	  static double N2b06c17b458(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 3.7083857307947032) {
	    p = SpeechDetector.N4888884e459(i);
	    } else if (((Double) i[3]).doubleValue() > 3.7083857307947032) {
	    p = SpeechDetector.N2a0850f8475(i);
	    } 
	    return p;
	  }
	  static double N4888884e459(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 6.503650691540114) {
	    p = SpeechDetector.N7bacde15460(i);
	    } else if (((Double) i[1]).doubleValue() > 6.503650691540114) {
	    p = SpeechDetector.N541187f9468(i);
	    } 
	    return p;
	  }
	  static double N7bacde15460(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 64.91543365451021) {
	    p = SpeechDetector.N12287422461(i);
	    } else if (((Double) i[0]).doubleValue() > 64.91543365451021) {
	    p = SpeechDetector.N6457ae46464(i);
	    } 
	    return p;
	  }
	  static double N12287422461(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 58.56496302885438) {
	    p = SpeechDetector.N1de06d7e462(i);
	    } else if (((Double) i[0]).doubleValue() > 58.56496302885438) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N1de06d7e462(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 1;
	    } else if (((Double) i[0]).doubleValue() <= 57.97087527140799) {
	    p = SpeechDetector.N79347a84463(i);
	    } else if (((Double) i[0]).doubleValue() > 57.97087527140799) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N79347a84463(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 4.7096135335202645) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 4.7096135335202645) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6457ae46464(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 4.613222125197662) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 4.613222125197662) {
	    p = SpeechDetector.N3872a921465(i);
	    } 
	    return p;
	  }
	  static double N3872a921465(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 2.7685489883382406) {
	    p = SpeechDetector.N6fbdd27a466(i);
	    } else if (((Double) i[6]).doubleValue() > 2.7685489883382406) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6fbdd27a466(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 1.3549242618786441) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 1.3549242618786441) {
	    p = SpeechDetector.N174580e6467(i);
	    } 
	    return p;
	  }
	  static double N174580e6467(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 2.1057284975138644) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 2.1057284975138644) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N541187f9468(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 2.494675897550935) {
	    p = SpeechDetector.N4af6178d469(i);
	    } else if (((Double) i[5]).doubleValue() > 2.494675897550935) {
	    p = SpeechDetector.N108d02eb473(i);
	    } 
	    return p;
	  }
	  static double N4af6178d469(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= 0.40336672862664735) {
	    p = SpeechDetector.N6284506d470(i);
	    } else if (((Double) i[10]).doubleValue() > 0.40336672862664735) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N6284506d470(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 2.050575858069967) {
	    p = SpeechDetector.N5cbc56a2471(i);
	    } else if (((Double) i[6]).doubleValue() > 2.050575858069967) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5cbc56a2471(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 1.7486616562226387) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 1.7486616562226387) {
	    p = SpeechDetector.N50dbd53e472(i);
	    } 
	    return p;
	  }
	  static double N50dbd53e472(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 2.235405591098128) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 2.235405591098128) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N108d02eb473(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 1.2541135821042342) {
	    p = SpeechDetector.N19ba9aca474(i);
	    } else if (((Double) i[3]).doubleValue() > 1.2541135821042342) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N19ba9aca474(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 65.89018479113989) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() > 65.89018479113989) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N2a0850f8475(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 4.60913966486987) {
	    p = SpeechDetector.N7fbdf57476(i);
	    } else if (((Double) i[1]).doubleValue() > 4.60913966486987) {
	    p = SpeechDetector.N3ff72465480(i);
	    } 
	    return p;
	  }
	  static double N7fbdf57476(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 1;
	    } else if (((Double) i[10]).doubleValue() <= -1.0178240482069376) {
	    p = SpeechDetector.N2903ccd9477(i);
	    } else if (((Double) i[10]).doubleValue() > -1.0178240482069376) {
	    p = SpeechDetector.N387dcf98478(i);
	    } 
	    return p;
	  }
	  static double N2903ccd9477(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 1.2369862921445052) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 1.2369862921445052) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N387dcf98478(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 3.054626589446259) {
	    p = SpeechDetector.N4bc82121479(i);
	    } else if (((Double) i[9]).doubleValue() > 3.054626589446259) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N4bc82121479(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 3.2307802290944405) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 3.2307802290944405) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N3ff72465480(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 1.470620414486263) {
	    p = SpeechDetector.N7a7683b1481(i);
	    } else if (((Double) i[8]).doubleValue() > 1.470620414486263) {
	    p = SpeechDetector.N13edd1f0485(i);
	    } 
	    return p;
	  }
	  static double N7a7683b1481(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 1;
	    } else if (((Double) i[7]).doubleValue() <= 3.3110091069645238) {
	    p = SpeechDetector.N7ac01846482(i);
	    } else if (((Double) i[7]).doubleValue() > 3.3110091069645238) {
	    p = SpeechDetector.N4f002a9d484(i);
	    } 
	    return p;
	  }
	  static double N7ac01846482(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= 0.6948081532192963) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() > 0.6948081532192963) {
	    p = SpeechDetector.N5979da9f483(i);
	    } 
	    return p;
	  }
	  static double N5979da9f483(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 1.4462583535670088) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 1.4462583535670088) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4f002a9d484(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 4.54162979249661) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 4.54162979249661) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N13edd1f0485(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 65.87143927255401) {
	    p = SpeechDetector.N6271edc8486(i);
	    } else if (((Double) i[0]).doubleValue() > 65.87143927255401) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N6271edc8486(Object []i) {
	    double p = Double.NaN;
	    if (i[11] == null) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() <= -1.7182774650323311) {
	      p = 1;
	    } else if (((Double) i[11]).doubleValue() > -1.7182774650323311) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N25b217f6487(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= -0.4958495461681351) {
	    p = SpeechDetector.N4f432acf488(i);
	    } else if (((Double) i[5]).doubleValue() > -0.4958495461681351) {
	    p = SpeechDetector.N1b8f2e35493(i);
	    } 
	    return p;
	  }
	  static double N4f432acf488(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= -1.874670999237465) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > -1.874670999237465) {
	    p = SpeechDetector.N42afa4b0489(i);
	    } 
	    return p;
	  }
	  static double N42afa4b0489(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 78.57897086148891) {
	    p = SpeechDetector.N19654104490(i);
	    } else if (((Double) i[0]).doubleValue() > 78.57897086148891) {
	    p = SpeechDetector.N75bc45de492(i);
	    } 
	    return p;
	  }
	  static double N19654104490(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 1.4914530634210728) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 1.4914530634210728) {
	    p = SpeechDetector.N468f7aa2491(i);
	    } 
	    return p;
	  }
	  static double N468f7aa2491(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() <= 0.47210065577712007) {
	      p = 0;
	    } else if (((Double) i[6]).doubleValue() > 0.47210065577712007) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N75bc45de492(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() <= -2.9856693993943075) {
	      p = 0;
	    } else if (((Double) i[8]).doubleValue() > -2.9856693993943075) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N1b8f2e35493(Object []i) {
	    double p = Double.NaN;
	    if (i[6] == null) {
	      p = 1;
	    } else if (((Double) i[6]).doubleValue() <= -0.8990412450268074) {
	    p = SpeechDetector.N5522a7b5494(i);
	    } else if (((Double) i[6]).doubleValue() > -0.8990412450268074) {
	    p = SpeechDetector.N52c54b3b499(i);
	    } 
	    return p;
	  }
	  static double N5522a7b5494(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 78.13991170475978) {
	    p = SpeechDetector.N563087bd495(i);
	    } else if (((Double) i[0]).doubleValue() > 78.13991170475978) {
	    p = SpeechDetector.N5c7c0754498(i);
	    } 
	    return p;
	  }
	  static double N563087bd495(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 0;
	    } else if (((Double) i[9]).doubleValue() <= 4.007643434453136) {
	    p = SpeechDetector.Nc1fb580496(i);
	    } else if (((Double) i[9]).doubleValue() > 4.007643434453136) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double Nc1fb580496(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() <= 2.4811673554950175) {
	      p = 0;
	    } else if (((Double) i[1]).doubleValue() > 2.4811673554950175) {
	    p = SpeechDetector.N75c4ecb7497(i);
	    } 
	    return p;
	  }
	  static double N75c4ecb7497(Object []i) {
	    double p = Double.NaN;
	    if (i[10] == null) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() <= -0.6712811149698966) {
	      p = 0;
	    } else if (((Double) i[10]).doubleValue() > -0.6712811149698966) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N5c7c0754498(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 0.14858510265894861) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 0.14858510265894861) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N52c54b3b499(Object []i) {
	    double p = Double.NaN;
	    if (i[1] == null) {
	      p = 1;
	    } else if (((Double) i[1]).doubleValue() <= 3.1522483023944305) {
	    p = SpeechDetector.N16ce38f1500(i);
	    } else if (((Double) i[1]).doubleValue() > 3.1522483023944305) {
	    p = SpeechDetector.N243e0b62506(i);
	    } 
	    return p;
	  }
	  static double N16ce38f1500(Object []i) {
	    double p = Double.NaN;
	    if (i[0] == null) {
	      p = 0;
	    } else if (((Double) i[0]).doubleValue() <= 72.85363344656007) {
	    p = SpeechDetector.N3cfc61e9501(i);
	    } else if (((Double) i[0]).doubleValue() > 72.85363344656007) {
	    p = SpeechDetector.N4f5b571e504(i);
	    } 
	    return p;
	  }
	  static double N3cfc61e9501(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= -3.719042101475947) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() > -3.719042101475947) {
	    p = SpeechDetector.N5d802746502(i);
	    } 
	    return p;
	  }
	  static double N5d802746502(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() <= 2.083191363967871) {
	      p = 0;
	    } else if (((Double) i[5]).doubleValue() > 2.083191363967871) {
	    p = SpeechDetector.N892949f503(i);
	    } 
	    return p;
	  }
	  static double N892949f503(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() <= 0.3185502647023922) {
	      p = 0;
	    } else if (((Double) i[2]).doubleValue() > 0.3185502647023922) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N4f5b571e504(Object []i) {
	    double p = Double.NaN;
	    if (i[7] == null) {
	      p = 0;
	    } else if (((Double) i[7]).doubleValue() <= -1.7553447016778203) {
	    p = SpeechDetector.N75b49b45505(i);
	    } else if (((Double) i[7]).doubleValue() > -1.7553447016778203) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N75b49b45505(Object []i) {
	    double p = Double.NaN;
	    if (i[4] == null) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() <= 1.901951473708097) {
	      p = 0;
	    } else if (((Double) i[4]).doubleValue() > 1.901951473708097) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N243e0b62506(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 2.1628228766111937) {
	    p = SpeechDetector.N655d6184507(i);
	    } else if (((Double) i[5]).doubleValue() > 2.1628228766111937) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N655d6184507(Object []i) {
	    double p = Double.NaN;
	    if (i[9] == null) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() <= 3.3668576205457095) {
	      p = 1;
	    } else if (((Double) i[9]).doubleValue() > 3.3668576205457095) {
	    p = SpeechDetector.N55ad5519508(i);
	    } 
	    return p;
	  }
	  static double N55ad5519508(Object []i) {
	    double p = Double.NaN;
	    if (i[8] == null) {
	      p = 1;
	    } else if (((Double) i[8]).doubleValue() <= 1.5566407279671122) {
	    p = SpeechDetector.N66ae0840509(i);
	    } else if (((Double) i[8]).doubleValue() > 1.5566407279671122) {
	      p = 1;
	    } 
	    return p;
	  }
	  static double N66ae0840509(Object []i) {
	    double p = Double.NaN;
	    if (i[2] == null) {
	      p = 1;
	    } else if (((Double) i[2]).doubleValue() <= 3.990325547995779) {
	    p = SpeechDetector.N2b9fd66a510(i);
	    } else if (((Double) i[2]).doubleValue() > 3.990325547995779) {
	      p = 0;
	    } 
	    return p;
	  }
	  static double N2b9fd66a510(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= -2.753335134053906) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > -2.753335134053906) {
	    p = SpeechDetector.Nab5df86511(i);
	    } 
	    return p;
	  }
	  static double Nab5df86511(Object []i) {
	    double p = Double.NaN;
	    if (i[5] == null) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() <= 1.755796751398632) {
	      p = 1;
	    } else if (((Double) i[5]).doubleValue() > 1.755796751398632) {
	    p = SpeechDetector.N2a65dbe8512(i);
	    } 
	    return p;
	  }
	  static double N2a65dbe8512(Object []i) {
	    double p = Double.NaN;
	    if (i[3] == null) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() <= 2.01224870661141) {
	      p = 0;
	    } else if (((Double) i[3]).doubleValue() > 2.01224870661141) {
	      p = 1;
	    } 
	    return p;
	  }
	}
