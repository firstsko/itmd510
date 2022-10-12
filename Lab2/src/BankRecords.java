import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankRecords extends Client {
	//setup static objects for IO processing

	//array of BankRecords objects
	static BankRecords robjs[] = new BankRecords[800];
	//arraylist to hold spreadsheet rows & columns
	static ArrayList<List<String>> array = new ArrayList<>();

	//instance fields
	private String id;
	private int age;
	private String sex;
	private String region;
	private Double income;
	private String married;
	private int children;
	private String car;
	private String save_act;
	private String current_act;
	private String mortgage;
	private String pep;
	/*create remaining instance fields with appropriate data types*/
	

	public static BankRecords[] getRobjs() {
		return robjs;
	}

	public static void setRobjs(BankRecords[] robjs) {
		BankRecords.robjs = robjs;
	}

	public static ArrayList<List<String>> getArray() {
		return array;
	}

	public static void setArray(ArrayList<List<String>> array) {
		BankRecords.array = array;
	}

	@Override
	public void readData() {

		BufferedReader br = null;
		//initialize reader object and set file path to root of project
		try {
			br = new BufferedReader(new FileReader(new File("bank-Detail.csv")));
			String line;
			//read each record in csv file
			while ((line = br.readLine()) != null) {
				//parse each record in csv file by a comma ( , )
				//into a list stored in the arraylist-> Arrays
				array.add(Arrays.asList(line.split(",")));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public void processData() {
		
		//create index for array while iterating thru arraylist
		 int idx=0;
		 for (List<String> rowData: array) {
			 robjs[idx]= new BankRecords();
			 robjs[idx].setId(rowData.get(0));
			 robjs[idx].setAge(Integer.parseInt(rowData.get(1)));
			 robjs[idx].setSex(rowData.get(2));
			 robjs[idx].setRegion(rowData.get(3));
			 robjs[idx].setIncome(Double.parseDouble(rowData.get(4)));
			 robjs[idx].setMarried(rowData.get(5));
			 robjs[idx].setChildren(Integer.parseInt(rowData.get(6)));
			 robjs[idx].setCar(rowData.get(7));
			 robjs[idx].setSave_act(rowData.get(8));
			 robjs[idx].setCurrent_act(rowData.get(9));
			 robjs[idx].setMortgage(rowData.get(10));
			 robjs[idx].setPep(rowData.get(11));
			 idx++;
		 }
	}
	
	@Override
	public void printData() {
		System.out.println("ID\t\t\tAGE\t\tSEX\t\t\tREGION\t\t\tINCOME\t\t\tMORTGAGE");
		 int idx=0;
		 for (List<String> rowData: array) {	
			 if(idx <=25) {
				 System.out.printf("%s\t\t%s\t\t%s\t\t%-11s\t\t%-9s\t\t%-9s\n",robjs[idx].getId(),robjs[idx].getAge(),robjs[idx].getSex(),robjs[idx].getRegion(),robjs[idx].getIncome(),robjs[idx].getMortgage());
			}
			 idx++;
		 }
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the income
	 */
	public Double getIncome() {
		return income;
	}
	/**
	 * @param income the income to set
	 */
	public void setIncome(Double income) {
		this.income = income;
	}
	/**
	 * @return the married
	 */
	public String getMarried() {
		return married;
	}
	/**
	 * @param married the married to set
	 */
	public void setMarried(String married) {
		this.married = married;
	}
	/**
	 * @return the children
	 */
	public int getChildren() {
		return children;
	}
	/**
	 * @param children the children to set
	 */
	public void setChildren(int children) {
		this.children = children;
	}
	/**
	 * @return the car
	 */
	public String getCar() {
		return car;
	}
	/**
	 * @param car the car to set
	 */
	public void setCar(String car) {
		this.car = car;
	}
	/**
	 * @return the save_act
	 */
	public String getSave_act() {
		return save_act;
	}
	/**
	 * @param save_act the save_act to set
	 */
	public void setSave_act(String save_act) {
		this.save_act = save_act;
	}
	/**
	 * @return the current_act
	 */
	public String getCurrent_act() {
		return current_act;
	}
	/**
	 * @param current_act the current_act to set
	 */
	public void setCurrent_act(String current_act) {
		this.current_act = current_act;
	}
	/**
	 * @return the mortgage
	 */
	public String getMortgage() {
		return mortgage;
	}
	/**
	 * @param mortgage the mortgage to set
	 */
	public void setMortgage(String mortgage) {
		this.mortgage = mortgage;
	}
	/**
	 * @return the pep
	 */
	public String getPep() {
		return pep;
	}
	/**
	 * @param pep the pep to set
	 */
	public void setPep(String pep) {
		this.pep = pep;
	}
	//instance fields
	
}
