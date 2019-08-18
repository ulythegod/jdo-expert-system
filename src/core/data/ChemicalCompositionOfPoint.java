package core.data;

/**
 * Данный класс используется для хранения данных о химическом обследовании отдельно взятой точки.
 */
public class ChemicalCompositionOfPoint {
  private int chemicalCompositionOfPointId;
  private transient ChemicalCompositionOfAgricultureField chemicalCompositionOfAgricultureField;
  private int number;
  private float latitude;
  private float longitude;
  private float phosphorus = 0;
  private float potassium = 0;
  private float nitrogen = 0;
  private float acidity = 0;
  private float humus = 0;
  private float calcium = 0;
  private float magnesium = 0;
  private float sulfur = 0;
  private float manganese = 0;
  private float zinc = 0;
  private float copper = 0;
  private float cobalt = 0;
  private float boron = 0;
  private float molybdenum = 0;

  public ChemicalCompositionOfPoint() {
  }

  /**
   * Возвращает идентификатор записи.
   *
   * @return Идентификатор записи
   */
  public int getСhemicalCompositionOfPointId() {
    return chemicalCompositionOfPointId;
  }

  /**
   * Устанавливает идентификатор записи.
   *
   * @param chemicalCompositionOfPointId Идентификатор записи
   */
  public void setChemicalCompositionOfPointId(int chemicalCompositionOfPointId) {
    this.chemicalCompositionOfPointId = chemicalCompositionOfPointId;
  }

  /**
   * Возвращает химическое обследование по полю.
   *
   * @return Химическое обследование по полю
   */
  public ChemicalCompositionOfAgricultureField getChemicalCompositionOfAgricultureField() {
    return chemicalCompositionOfAgricultureField;
  }

  /**
   * Устанавливает химическое обследование по полю.
   *
   * @param chemicalCompositionOfAgricultureField Химическое обследование по полю
   */
  public void setChemicalCompositionOfAgricultureField(
      ChemicalCompositionOfAgricultureField chemicalCompositionOfAgricultureField) {
    this.chemicalCompositionOfAgricultureField = chemicalCompositionOfAgricultureField;
  }

  /**
   * Возвращает номер точки.
   *
   * @return Номер точки
   */
  public int getNumber() {
    return number;
  }

  /**
   * Устанавливает номер точки.
   *
   * @param number Номер точки
   */
  public void setNumber(int number) {
    this.number = number;
  }

  /**
   * Возвращает широту точки.
   *
   * @return Широта точки
   */
  public float getLatitude() {
    return latitude;
  }

  /**
   * Устанавливает широту точки.
   *
   * @param latitude Широта точки
   */
  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  /**
   * Возвращает долготу точки.
   *
   * @return Долгота точки
   */
  public float getLongitude() {
    return longitude;
  }

  /**
   * Устанавливает долготу точки.
   *
   * @param longitude Долгота точки
   */
  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  /**
   * Возвращает показатель фосфора.
   *
   * @return Показатель фосфора
   */
  public float getPhosphorus() {
    return phosphorus;
  }

  /**
   * Устанавливает показатель фосфора.
   *
   * @param phosphorus Показатель фосфора
   */
  public void setPhosphorus(float phosphorus) {
    this.phosphorus = phosphorus;
  }

  /**
   * Возвращает показатель калия.
   *
   * @return Показатель калия
   */
  public float getPotassium() {
    return potassium;
  }

  /**
   * Устанавливает показатель калия.
   *
   * @param potassium Показатель калия
   */
  public void setPotassium(float potassium) {
    this.potassium = potassium;
  }

  /**
   * Возвращает показатель азота.
   *
   * @return Показатель азота
   */
  public float getNitrogen() {
    return nitrogen;
  }

  /**
   * Устанавливает показатель азота.
   *
   * @param nitrogen Показатель азота
   */
  public void setNitrogen(float nitrogen) {
    this.nitrogen = nitrogen;
  }

  /**
   * Возвращает показатель кислотности.
   *
   * @return Показатель кислотности
   */
  public float getAcidity() {
    return acidity;
  }

  /**
   * Устанавливает показатель кислотности.
   *
   * @param acidity Показатель кислотности
   */
  public void setAcidity(float acidity) {
    this.acidity = acidity;
  }

  /**
   * Возвращает показатель гумуса.
   *
   * @return Показатель гумуса
   */
  public float getHumus() {
    return humus;
  }

  /**
   * Устанавливает показатель гумуса.
   *
   * @param humus Показатель гумуса
   */
  public void setHumus(float humus) {
    this.humus = humus;
  }

  /**
   * Возвращает показатель кальция.
   *
   * @return Показатель кальция
   */
  public float getCalcium() {
    return calcium;
  }

  /**
   * Устанавливает показатель кальция.
   *
   * @param calcium Показатель кальция
   */
  public void setCalcium(float calcium) {
    this.calcium = calcium;
  }

  /**
   * Возвращает показатель магния.
   *
   * @return Показатель магния
   */
  public float getMagnesium() {
    return magnesium;
  }

  /**
   * Устанавливает показатель магния.
   *
   * @param magnesium Показатель магния
   */
  public void setMagnesium(float magnesium) {
    this.magnesium = magnesium;
  }

  /**
   * Возвращает показатель серы.
   *
   * @return Показатель серы
   */
  public float getSulfur() {
    return sulfur;
  }

  /**
   * Устанавливает показатель серы.
   *
   * @param sulfur Показатель серы
   */
  public void setSulfur(float sulfur) {
    this.sulfur = sulfur;
  }

  /**
   * Возвращает показатель марганца.
   *
   * @return Показатель марганца
   */
  public float getManganese() {
    return manganese;
  }

  /**
   * Устанавливает показатель марганца.
   *
   * @param manganese Показатель марганца
   */
  public void setManganese(float manganese) {
    this.manganese = manganese;
  }

  /**
   * Возвращает показатель цинка.
   *
   * @return Показатель цинка
   */
  public float getZinc() {
    return zinc;
  }

  /**
   * Устанавливает показатель цинка.
   *
   * @param zinc Показатель цинка
   */
  public void setZinc(float zinc) {
    this.zinc = zinc;
  }

  /**
   * Возвращает показатель меди.
   *
   * @return Показатель меди
   */
  public float getCopper() {
    return copper;
  }

  /**
   * Устанавливает показатель меди.
   *
   * @param copper Показатель меди
   */
  public void setCopper(float copper) {
    this.copper = copper;
  }

  /**
   * Возвращает показатель кобальта.
   *
   * @return Показатель кобальта
   */
  public float getCobalt() {
    return cobalt;
  }

  /**
   * Устанавливает показатель кобальта.
   *
   * @param cobalt Показатель кобальта
   */
  public void setCobalt(float cobalt) {
    this.cobalt = cobalt;
  }

  /**
   * Возвращает показатель бора.
   *
   * @return Показатель бора
   */
  public float getBoron() {
    return boron;
  }

  /**
   * Устанавливает показатель бора.
   *
   * @param boron Показатель бора
   */
  public void setBoron(float boron) {
    this.boron = boron;
  }

  /**
   * Возвращает показатель молибдена.
   *
   * @return Показатель молибдена
   */
  public float getMolybdenum() {
    return molybdenum;
  }

  /**
   * Устанавливает показатель молибдена.
   *
   * @param molybdenum Показатель молибдена
   */
  public void setMolybdenum(float molybdenum) {
    this.molybdenum = molybdenum;
  }
}
