package core.data;

import java.util.*;

/**
 * Данный класс используется для хранения данных о химическом обследовании отдельно взятого поля.
 */
public class ChemicalCompositionOfAgricultureField {
  private int chemicalCompositionOfAgricultureFieldId;
  private transient ChemicalSurvey chemicalSurvey;
  private int number;
  private ArrayList<ChemicalCompositionOfPoint> points = new ArrayList<ChemicalCompositionOfPoint>();
  private float averagePhosphorus = 0;
  private float averagePotassium = 0;
  private float averageNitrogen = 0;
  private float averageAcidity = 0;
  private float averageHumus = 0;
  private float averageCalcium = 0;
  private float averageMagnesium = 0;
  private float averageSulfur = 0;
  private float averageManganese = 0;
  private float averageZinc = 0;
  private float averageCopper = 0;
  private float averageCobalt = 0;
  private float averageBoron = 0;
  private float averageMolybdenum = 0;

  public ChemicalCompositionOfAgricultureField() {
  }

  /**
   * Возвращает идентификатор записи.
   *
   * @return Идентификатор записи
   */
  public int getChemicalCompositionOfAgricultureFieldId() {
    return chemicalCompositionOfAgricultureFieldId;
  }

  /**
   * Устанавливает идентификатор записи.
   *
   * @param chemicalCompositionOfAgricultureFieldId Идентификатор записи
   */
  public void setChemicalCompositionOfAgricultureFieldId(int chemicalCompositionOfAgricultureFieldId) {
    this.chemicalCompositionOfAgricultureFieldId = chemicalCompositionOfAgricultureFieldId;
  }

  /**
   * Возвращает основное химическое обследование.
   *
   * @return Химическое обследование
   */
  public ChemicalSurvey getChemicalSurvey() {
    return chemicalSurvey;
  }

  /**
   * Устанавливает основное химическое обследование.
   *
   * @param chemicalSurvey Химическое обследование
   */
  public void setChemicalSurvey(ChemicalSurvey chemicalSurvey) {
    this.chemicalSurvey = chemicalSurvey;
  }

  /**
   * Возвращает номер поля.
   *
   * @return Номер поля
   */
  public int getNumber() {
    return number;
  }

  /**
   * Устанавливает номер поля.
   *
   * @param number Номер поля
   */
  public void setNumber(int number) {
    this.number = number;
  }

  /**
   * Возвращает список химических обследований по каждой точке.
   *
   * @return Список химических обследований по каждой точке
   */
  public ArrayList<ChemicalCompositionOfPoint> getPoints() {
    return points;
  }

  /**
   * Устанавливает список химических обследований по каждой точке.
   *
   * @param points Список химических обследований по каждой точке
   */
  public void setPoints(ArrayList<ChemicalCompositionOfPoint> points) {
    this.points = points;

    // рассчет средневзвешенных показателей
    int size = points.size();
    float totalPhosphorus = 0;
    float totalPotassium = 0;
    float totalNitrogen = 0;
    float totalAcidity = 0;
    float totalHumus = 0;
    float totalCalcium = 0;
    float totalMagnesium = 0;
    float totalSulfur = 0;
    float totalManganese = 0;
    float totalZinc = 0;
    float totalCopper = 0;
    float totalCobalt = 0;
    float totalBoron = 0;
    float totalMolybdenum = 0;
    for (ChemicalCompositionOfPoint point : points) {
      totalPhosphorus += point.getPhosphorus();
      totalPotassium += point.getPotassium();
      totalNitrogen += point.getNitrogen();
      totalAcidity += point.getAcidity();
      totalHumus += point.getHumus();
      totalCalcium += point.getCalcium();
      totalMagnesium += point.getMagnesium();
      totalSulfur += point.getSulfur();
      totalManganese += point.getManganese();
      totalZinc += point.getZinc();
      totalCopper += point.getCopper();
      totalCobalt += point.getCobalt();
      totalBoron += point.getBoron();
      totalMolybdenum += point.getMolybdenum();
    }
    averagePhosphorus = totalPhosphorus / size;
    averagePotassium = totalPotassium / size;
    averageNitrogen = totalNitrogen / size;
    averageAcidity = totalAcidity / size;
    averageHumus = totalHumus / size;
    averageCalcium = totalCalcium / size;
    averageMagnesium = totalMagnesium / size;
    averageSulfur = totalSulfur / size;
    averageManganese = totalManganese / size;
    averageZinc = totalZinc / size;
    averageCopper = totalCopper / size;
    averageCobalt = totalCobalt / size;
    averageBoron = totalBoron / size;
    averageMolybdenum = totalMolybdenum / size;
  }

  /**
   * Возвращает средневзвешенное значение фосфора.
   *
   * @return Средневзвешенное значение фосфора
   */
  public float getAveragePhosphorus() {
    return averagePhosphorus;
  }

  /**
   * Возвращает средневзвешенное значение калия.
   *
   * @return Средневзвешенное значение калия
   */
  public float getAveragePotassium() {
    return averagePotassium;
  }

  /**
   * Возвращает средневзвешенное значение азота.
   *
   * @return Средневзвешенное значение азота
   */
  public float getAverageNitrogen() {
    return averageNitrogen;
  }

  /**
   * Возвращает средневзвешенное значение кислотности.
   *
   * @return Средневзвешенное значение кислотности
   */
  public float getAverageAcidity() {
    return averageAcidity;
  }

  /**
   * Возвращает средневзвешенное значение гумуса.
   *
   * @return Средневзвешенное значение гумуса
   */
  public float getAverageHumus() {
    return averageHumus;
  }

  /**
   * Возвращает средневзвешенное значение кальция.
   *
   * @return Средневзвешенное значение кальция
   */
  public float getAverageCalcium() {
    return averageCalcium;
  }

  /**
   * Возвращает средневзвешенное значение магния.
   *
   * @return Средневзвешенное значение магния
   */
  public float getAverageMagnesium() {
    return averageMagnesium;
  }

  /**
   * Возвращает средневзвешенное значение серы.
   *
   * @return Средневзвешенное значение серы
   */
  public float getAverageSulfur() {
    return averageSulfur;
  }

  /**
   * Возвращает средневзвешенное значение марганца.
   *
   * @return Средневзвешенное значение марганца
   */
  public float getAverageManganese() {
    return averageManganese;
  }

  /**
   * Возвращает средневзвешенное значение цинка.
   *
   * @return Средневзвешенное значение цинка
   */
  public float getAverageZinc() {
    return averageZinc;
  }

  /**
   * Возвращает средневзвешенное значение меди.
   *
   * @return Средневзвешенное значение меди
   */
  public float getAverageCopper() {
    return averageCopper;
  }

  /**
   * Возвращает средневзвешенное значение кобальта.
   *
   * @return Средневзвешенное значение кобальта
   */
  public float getAverageCobalt() {
    return averageCobalt;
  }

  /**
   * Возвращает средневзвешенное значение бора.
   *
   * @return Средневзвешенное значение бора
   */
  public float getAverageBoron() {
    return averageBoron;
  }

  /**
   * Возвращает средневзвешенное значение молибдена.
   *
   * @return Средневзвешенное значение молибдена
   */
  public float getAverageMolybdenum() {
    return averageMolybdenum;
  }
}
