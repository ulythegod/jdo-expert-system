package core.data;

import java.util.*;

/**
 * Данный класс используется для хранения данных о химическом обследовании одного или
 * нескольких полей.
 */
public class ChemicalSurvey {
  private int chemicalSurveyId;
  private ArrayList<ChemicalCompositionOfAgricultureField> chemicalCompositionOfAgricultureFields =
    new ArrayList<ChemicalCompositionOfAgricultureField>();
  private int phosphorusMethodId = 0;
  private int potassiumMethodId = 0;
  private int nitrogenMethodId = 0;
  private int acidityMethodId = 0;
  private int humusMethodId = 0;
  private int calciumMethodId = 0;
  private int magnesiumMethodId = 0;
  private int sulfurMethodId = 0;
  private int manganeseMethodId = 0;
  private int zincMethodId = 0;
  private int copperMethodId = 0;
  private int cobaltMethodId = 0;
  private int boronMethodId = 0;
  private int molybdenumMethodId = 0;

  public ChemicalSurvey() {
  }

  /**
   * Возвращает идентификатор записи.
   *
   * @return Идентификатор записи
   */
  public int getСhemicalSurveyId() {
    return chemicalSurveyId;
  }

  /**
   * Устанавливает идентификатор записи.
   *
   * @param chemicalSurveyId Идентификатор записи
   */
  public void setChemicalSurveyId(int chemicalSurveyId) {
    this.chemicalSurveyId = chemicalSurveyId;
  }

  /**
   * Возвращает список химических обследований по каждому полю.
   *
   * @return Список химических обследований по каждому полю
   */
  public ArrayList<ChemicalCompositionOfAgricultureField> getСhemicalCompositionOfAgricultureFields() {
    return chemicalCompositionOfAgricultureFields;
  }

  /**
   * Устанавливает список химических обследований по каждому полю.
   *
   * @param chemicalCompositionOfAgricultureFields Список химических обследований по каждому полю
   */
  public void setChemicalCompositionOfAgricultureFields(
      ArrayList<ChemicalCompositionOfAgricultureField> chemicalCompositionOfAgricultureFields) {
    this.chemicalCompositionOfAgricultureFields = chemicalCompositionOfAgricultureFields;
  }

  /**
   * Возвращает идентификатор метода обследования фосфора.
   *
   * @return Идентификатор метода обследования
   */
  public int getPhosphorusMethodId() {
    return phosphorusMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования фосфора.
   *
   * @param phosphorusMethodId Идентификатор метода обследования
   */
  public void setPhosphorusMethodId(int phosphorusMethodId) {
    this.phosphorusMethodId = phosphorusMethodId;
  }

  /**
   * Возвращает идентификатор метода обследования калия.
   *
   * @return Идентификатор метода обследования
   */
  public int getPotassiumMethodId() {
    return potassiumMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования калия.
   *
   * @param potassiumMethodId Идентификатор метода обследования
   */
  public void setPotassiumMethodId(int potassiumMethodId) {
    this.potassiumMethodId = potassiumMethodId;
  }

  /**
   * Возвращает идентификатор метода обследования азота.
   *
   * @return Идентификатор метода обследования
   */
  public int getNitrogenMethodId() {
    return nitrogenMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования азота.
   *
   * @param nitrogenMethodId Идентификатор метода обследования
   */
  public void setNitrogenMethodId(int nitrogenMethodId) {
    this.nitrogenMethodId = nitrogenMethodId;
  }

  /**
   * Возвращает идентификатор метода обследования кислотности.
   *
   * @return Идентификатор метода обследования
   */
  public int getAcidityMethodId() {
    return acidityMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования кислотности.
   *
   * @param acidityMethodId Идентификатор метода обследования
   */
  public void setAcidityMethodId(int acidityMethodId) {
    this.acidityMethodId = acidityMethodId;
  }

  /**
   * Возвращает идентификатор метода обследования гумуса.
   *
   * @return Идентификатор метода обследования
   */
  public int getHumusMethodId() {
    return humusMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования гумуса.
   *
   * @param humusMethodId Идентификатор метода обследования
   */
  public void setHumusMethodId(int humusMethodId) {
    this.humusMethodId = humusMethodId;
  }

  /**
   * Возвращает идентификатор метода обследования кальция.
   *
   * @return Идентификатор метода обследования
   */
  public int getCalciumMethodId() {
    return calciumMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования кальция.
   *
   * @param calciumMethodId Идентификатор метода обследования
   */
  public void setCalciumMethodId(int calciumMethodId) {
    this.calciumMethodId = calciumMethodId;
  }

  /**
   * Возвращает идентификатор метода обследования магния.
   *
   * @return Идентификатор метода обследования
   */
  public int getMagnesiumMethodId() {
    return magnesiumMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования магния.
   *
   * @param magnesiumMethodId Идентификатор метода обследования
   */
  public void setMagnesiumMethodId(int magnesiumMethodId) {
    this.magnesiumMethodId = magnesiumMethodId;
  }

  /**
   * Возвращает идентификатор метода обследования серы.
   *
   * @return Идентификатор метода обследования
   */
  public int getSulfurMethodId() {
    return sulfurMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования серы.
   *
   * @param sulfurMethodId Идентификатор метода обследования
   */
  public void setSulfurMethodId(int sulfurMethodId) {
    this.sulfurMethodId = sulfurMethodId;
  }

  /**
   * Возвращает идентификатор метода обследования марганца.
   *
   * @return Идентификатор метода обследования
   */
  public int getManganeseMethodId() {
    return manganeseMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования марганца.
   *
   * @param manganeseMethodId Идентификатор метода обследования
   */
  public void setManganeseMethodId(int manganeseMethodId) {
    this.manganeseMethodId = manganeseMethodId;
  }

  /**
   * Возвращает идентификатор метода обследования цинка.
   *
   * @return Идентификатор метода обследования
   */
  public int getZincMethodId() {
    return zincMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования цинка.
   *
   * @param zincMethodId Идентификатор метода обследования
   */
  public void setZincMethodId(int zincMethodId) {
    this.zincMethodId = zincMethodId;
  }

  /**
   * Возвращает идентификатор метода обследования меди.
   *
   * @return Идентификатор метода обследования
   */
  public int getCopperMethodId() {
    return copperMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования меди.
   *
   * @param copperMethodId Идентификатор метода обследования
   */
  public void setCopperMethodId(int copperMethodId) {
    this.copperMethodId = copperMethodId;
  }

  /**
   * Возвращает идентификатор метода обследования кобальта.
   *
   * @return Идентификатор метода обследования
   */
  public int getCobaltMethodId() {
    return cobaltMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования кобальта.
   *
   * @param cobaltMethodId Идентификатор метода обследования
   */
  public void setCobaltMethodId(int cobaltMethodId) {
    this.cobaltMethodId = cobaltMethodId;
  }

  /**
   * Возвращает идентификатор метода обследования бора.
   *
   * @return Идентификатор метода обследования
   */
  public int getBoronMethodId() {
    return boronMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования бора.
   *
   * @param boronMethodId Идентификатор метода обследования
   */
  public void setBoronMethodId(int boronMethodId) {
    this.boronMethodId = boronMethodId;
  }

  /**
   * Возвращает идентификатор метода обследования молибдена.
   *
   * @return Идентификатор метода обследования
   */
  public int getMolybdenumMethodId() {
    return molybdenumMethodId;
  }

  /**
   * Устанавливает идентификатор метода обследования молибдена.
   *
   * @param molybdenumMethodId Идентификатор метода обследования
   */
  public void setMolybdenumMethodId(int molybdenumMethodId) {
    this.molybdenumMethodId = molybdenumMethodId;
  }
}
