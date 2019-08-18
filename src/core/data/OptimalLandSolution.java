package core.data;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class OptimalLandSolution
{
    private int id;
    private String name;
    private String dateCreate;
    private String dateLastChange;
    private SolutionState state;
    private float function;
    private String mode;
    private int flag;
    private float delta2;
    private float delta3;
    private LandBase landBase;

    private Collection plans = new HashSet();
    private Collection resultFirstStage= new HashSet();
    private Collection resultSecondThirdStageAlgorithm1= new HashSet();
    private Collection resultSecondThirdStageAlgorithm2= new HashSet();
    private Collection resultSecondThirdStageAlgorithm3= new HashSet();

    private transient Map groundareas = new HashMap<String,Float>();

    public OptimalLandSolution() { }

    public Map calculatingGroundAreasForResultFirstStage(){
        ResultFirstStage res;
        float sum=0;
        String typesoil;
        for (Object rfs: resultFirstStage){
            res = (ResultFirstStage)rfs;
            typesoil=res.getTypeOfSoil().getNameTypeSoil().toString();
            sum=res.getGa();
            if (groundareas.containsKey(typesoil))
                sum+=(Float)groundareas.get(typesoil);
            groundareas.put(typesoil, sum);
        }
        return groundareas;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDateCreate() { return dateCreate; }

    public void setDateCreate(String dateCreate) { this.dateCreate = dateCreate; }

    public String getDateLastChange() { return dateLastChange; }

    public void setDateLastChange(String dateLastChange) { this.dateLastChange = dateLastChange; }

    public SolutionState getState() { return state; }

    public void setState(SolutionState state) { this.state = state; }

    public float getFunction() { return function; }

    public void setFunction(float function) { this.function = function; }

    public String getMode() { return mode; }

    public void setMode(String mode) { this.mode = mode; }

    public int getFlag() { return flag; }

    public void setFlag(int flag) { this.flag = flag; }

    public float getDelta2() { return delta2; }

    public void setDelta2(float delta2) { this.delta2 = delta2; }

    public float getDelta3() { return delta3; }

    public void setDelta3(float delta3) { this.delta3 = delta3; }

    public LandBase getLandBase() { return landBase; }

    public void setLandBase(LandBase landBase) { this.landBase = landBase; }

    public Collection getPlans() { return plans; }

    public void setPlans(Collection plans) { this.plans = plans; }

    public Collection getResultFirstStage() { return resultFirstStage; }

    public void setResultFirstStage(Collection resultFirstStage) { this.resultFirstStage = resultFirstStage; }

    public Collection getResultSecondThirdStageAlgorithm1() { return resultSecondThirdStageAlgorithm1; }

    public void setResultSecondThirdStageAlgorithm1(Collection resultSecondThirdStageAlgorithm1) { this.resultSecondThirdStageAlgorithm1 = resultSecondThirdStageAlgorithm1; }

    public Collection getResultSecondThirdStageAlgorithm2() { return resultSecondThirdStageAlgorithm2; }

    public void setResultSecondThirdStageAlgorithm2(Collection resultSecondThirdStageAlgorithm2) { this.resultSecondThirdStageAlgorithm2 = resultSecondThirdStageAlgorithm2; }

    public Collection getResultSecondThirdStageAlgorithm3() { return resultSecondThirdStageAlgorithm3; }

    public void setResultSecondThirdStageAlgorithm3(Collection resultSecondThirdStageAlgorithm3) { this.resultSecondThirdStageAlgorithm3 = resultSecondThirdStageAlgorithm3; }

    public Map getGroundareas() { return groundareas; }

    public void setGroundareas(Map groundareas) { this.groundareas = groundareas; }
}
