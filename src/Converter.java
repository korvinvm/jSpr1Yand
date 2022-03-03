public class Converter {
    int valueStep = 50;
    int longStepMM = 750;   // в миллиметрах

    double  convertStepToKM(Integer Step) {
        return (Step * (double)longStepMM / 1000000);
    }



    double convertStepToColorie(Integer Step) {
        return Double.valueOf(Step * (double)valueStep/1000);
    }

}
//  *0.75
// 1шаг 50 калл
// 1ккалл = 1000калл