/**
 * JavaFx works with two components, a .fxml file where all the document structure is defined
 * and a Controller.java file that executes all the commands. The functions defined in the controller file
 * are then placed into "slots", listener-ready modules in the .fxml file that have specific triggers.
 * For added convenience when editing the GUI, SceneBuilder is employed to design the interface at first.
 * While many other GUI libraries exist, JavaFX was chosen because of it being relatively new.
 * The GUI was also built from the ground in an effort to learn the library. There probably exists a library
 * for doing spreadsheets but getting to know the ropes of JavaFX was worth the hassle.
 * <p>
 * In this specific scenario, a Student.java class is initialized per student. This class has several attributes that
 * are useful to later on calculate all the required stats
 */

package GUI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.*;

public class MainController implements Initializable {


    // Assign every (widget?) from JavaFX to a variable name while defining the inherited object and data type
    @FXML
    private TableView<Student> tableView;
    @FXML
    private TableColumn<Student, String> Student;
    @FXML
    private TableColumn<Student, Integer> HW1;
    @FXML
    private TableColumn<Student, Integer> HW2;
    @FXML
    private TableColumn<Student, Integer> HW3;
    @FXML
    private TableColumn<Student, Integer> HW4;
    @FXML
    private TableColumn<Student, Integer> PR1;
    @FXML
    private TableColumn<Student, Integer> PR2;
    @FXML
    private TableColumn<Student, Integer> FPR;
    @FXML
    private TableColumn<Student, Integer> FEX;
    @FXML
    private TableColumn<Student, Integer> FNL;

    ObservableList<Student> data = generateStudents();

    //Initializes values for table. This is called at the beginning of the execution
    public void initialize(URL url, ResourceBundle rb) {
        //Set up a cell factory
        //This enables the generation of values as tables in JavaFx are not populated
        //by default.
        Student.setCellValueFactory(new PropertyValueFactory<>("name"));
        HW1.setCellValueFactory(new PropertyValueFactory<>("hw1"));
        HW2.setCellValueFactory(new PropertyValueFactory<>("hw2"));
        HW3.setCellValueFactory(new PropertyValueFactory<>("hw3"));
        HW4.setCellValueFactory(new PropertyValueFactory<>("hw4"));
        PR1.setCellValueFactory(new PropertyValueFactory<>("pr1"));
        PR2.setCellValueFactory(new PropertyValueFactory<>("pr2"));
        FPR.setCellValueFactory(new PropertyValueFactory<>("fpr"));
        FEX.setCellValueFactory(new PropertyValueFactory<>("fex"));
        FNL.setCellValueFactory(new PropertyValueFactory<>("favg"));

        // Make columns and cells editable
        // When linked to a column  "On edit commit" slot, this creates a text box
        // for the user to input text
        tableView.setEditable(true);
        Student.setCellFactory(TextFieldTableCell.forTableColumn());
        //A special method is needed to convert the string output from a TextFieldTableCell to an int
        //While respecting the object type
        HW1.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        HW2.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        HW3.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        HW4.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        PR1.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        PR1.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        PR2.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        FPR.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        FEX.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        FNL.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));

        //Fill table using data
        ObservableList<Student> data = generateStudents();
        tableView.setItems(data);

    }

    //    Each one of these functions define the neccessary event handlers for when a cell edition is finished

    public void changeStudentsnameCellEvent(TableColumn.CellEditEvent editedcell) {

        Student studentselected = tableView.getSelectionModel().getSelectedItem();
        studentselected.setName(editedcell.getNewValue().toString());
    }

    public void changeHw1(TableColumn.CellEditEvent editedcell) {
        Student studentselected = tableView.getSelectionModel().getSelectedItem();
        studentselected.setHw1((Integer) editedcell.getNewValue());
    }

    public void changeHw2(TableColumn.CellEditEvent editedcell) {
        Student studentselected = tableView.getSelectionModel().getSelectedItem();
        studentselected.setHw2((Integer) editedcell.getNewValue());
    }

    public void changeHw3(TableColumn.CellEditEvent editedcell) {
        Student studentselected = tableView.getSelectionModel().getSelectedItem();
        studentselected.setHw3((Integer) editedcell.getNewValue());
    }

    public void changeHw4(TableColumn.CellEditEvent editedcell) {
        Student studentselected = tableView.getSelectionModel().getSelectedItem();
        studentselected.setHw4((Integer) editedcell.getNewValue());
    }

    public void changePr1(TableColumn.CellEditEvent editedcell) {
        Student studentselected = tableView.getSelectionModel().getSelectedItem();
        studentselected.setPr1((Integer) editedcell.getNewValue());
    }

    public void changePr2(TableColumn.CellEditEvent editedcell) {
        Student studentselected = tableView.getSelectionModel().getSelectedItem();
        studentselected.setPr2((Integer) editedcell.getNewValue());
    }

    public void changeFpr(TableColumn.CellEditEvent editedcell) {
        Student studentselected = tableView.getSelectionModel().getSelectedItem();
        studentselected.setFpr((Integer) editedcell.getNewValue());
    }

    public void changeFex(TableColumn.CellEditEvent editedcell) {
        Student studentselected = tableView.getSelectionModel().getSelectedItem();
        studentselected.setFex((Integer) editedcell.getNewValue());
    }
    public void calculateFnl() {
        for(int i = 0; i <= 8; i++) {
            Student modstudent = getStudent(i);
            modstudent.setFavg(getFinalAverage(modstudent));
        }
    }

    // TODO Make the text cells tabbable through https://stackoverflow.com/questions/22211860/javafx-tab-through-editable-cellsimport javafx.collections.FXCollections;
    // TODO Clean warnings

    // TODO Bind an auto calc funtion to the tabswitch event https://github.com/TomasMikula/EasyBind
    // TODO Finally map the final grades array to a standard deviation


    /**
     * Return TableView row as a Student Object
     *
     * @param row
     * @return Student
     */
    public Student getStudent(int row) {
        return tableView.getItems().get(row);
    }

    // From https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
    public static double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();
    BigDecimal bd = new BigDecimal(value);
    bd = bd.setScale(places, RoundingMode.HALF_UP);
    return bd.doubleValue();
}

    public double getColumnStdDev(int columnindex) {
        double d = round(Math.sqrt(getColumnVariance(columnindex)),4);
        return d;
    }

    /**
     * Returns a TableView's column variance
     * <p>
     * Although we could use math.stat.variance from the Apache library, I guess the point here is to do it manually
     * Pity, it was one of the rare ready-to-use java modules. It even took an array as an arg!
     *
     * @param columnindex
     * @return list
     **/
    public double getColumnVariance(int columnindex) {
        double colavg = getColumnAverage(columnindex);
        List<Integer> colarr = ColumntoArray(columnindex);
        double toppart = 0.0;
        for (int t : colarr
        ) {
            double temp = t - colavg;
            toppart += Math.pow(temp, 2);
        }
        double toret =  (toppart / (colarr.size() - 1));
        return round(toret, 4);
    }

    /**
     * Compute a TableView's row (Student) final grade
     *
     * @param row
     * @return int
     */
    public int getFinalAverage(Student row) {
        int hw = 0;
        int pr = 0;
        hw += row.getHw1();
        hw += row.getHw2();
        hw += row.getHw3();
        hw += row.getHw4();
        int hwper = ((hw) * 40) / 400;

        pr += row.getPr1();
        pr += row.getPr2();
        int prper = ((pr) * 15) / 200;

        int fprper = (row.getFpr() * 25) / 100;
        int fexper = (row.getFpr() * 20) / 100;
        return hwper + prper + fprper + fexper;
    }

    /**
     * Changes a Student Object into an Array List
     *
     * @param columnIndex
     * @return ArrayList
     */
    public List ColumntoArray(int columnIndex) {
        List<Integer> column = new ArrayList<>(20);
        switch (columnIndex) {
            case 0: //name
//                    for (int i = 0; i <= 19; i++) {
//                        column.add(getStudent(i).getName(), columnIndex);
//                    }
                break;
            case 1:
                for (int i = 0; i <= 19; i++) {
                    column.add(getStudent(i).getHw1());
                }
                break;
            case 2:
                for (int i = 0; i <= 19; i++) {
                    column.add(getStudent(i).getHw2());
                }
                break;
            case 3:
                for (int i = 0; i <= 19; i++) {
                    column.add(getStudent(i).getHw3());
                }
                break;
            case 4:
                for (int i = 0; i <= 19; i++) {
                    column.add(getStudent(i).getHw4());
                }
                break;
            case 5:
                for (int i = 0; i <= 19; i++) {
                    column.add(getStudent(i).getPr1());
                }
                break;
            case 6:
                for (int i = 0; i <= 19; i++) {
                    column.add(getStudent(i).getPr2());
                }
                break;
            case 7:
                for (int i = 0; i <= 19; i++) {
                    column.add(getStudent(i).getFpr());
                }
                break;
            case 8:
                for (int i = 0; i <= 19; i++) {
                    column.add(getStudent(i).getFex());
                }
                break;
            case 9:
                for (int i = 0; i <= 19; i++) {
                    column.add(getStudent(i).getFavg());
                }
        }
        return column;
    }

    /**
     * Calculates mean of column
     *
     * @param columnindex
     * @return double
     */
    public double getColumnAverage(int columnindex) {
        double sum = 0;
        switch (columnindex) {
            case 0: //name
                sum = 0;
                break;
            case 1:
                for (int i = 0; i <= 19; i++) {
                    sum += getStudent(i).getHw1();
                }
                break;
            case 2:
                for (int i = 0; i <= 19; i++) {
                    sum += getStudent(i).getHw2();
                }
                break;
            case 3:
                for (int i = 0; i <= 19; i++) {
                    sum += getStudent(i).getHw3();
                }
                break;
            case 4:
                for (int i = 0; i <= 19; i++) {
                    sum += getStudent(i).getHw4();
                }
                break;
            case 5:
                for (int i = 0; i <= 19; i++) {
                    sum += getStudent(i).getPr1();
                }
                break;
            case 6:
                for (int i = 0; i <= 19; i++) {
                    sum += getStudent(i).getPr2();
                }
                break;
            case 7:
                for (int i = 0; i <= 19; i++) {
                    sum += getStudent(i).getFpr();
                }
                break;
            case 8:
                for (int i = 0; i <= 19; i++) {
                    sum += getStudent(i).getFex();
                }
                break;
            case 9:
                for (int i = 0; i <= 19; i++) {
                    sum += getStudent(i).getFavg();
                }
        }
        return sum / 20.0;
    }

//     This function is not as modular as the others because of its specialization
//    public TreeMap getTop5() {
//        List<Double> gradecol = ColumntoArray(9);
//        List<String> namecol = ColumntoArray(0);
//        TreeMap<Double, String> relationMap = new TreeMap<>();
//        for (int i = 0; i <= 20; i++) {
//            relationMap.put(gradecol.get(i), namecol.get(i));
//        }
//        for (int i = 0; i <= 15; i++) {
//            relationMap.remove(i);
//        }
//        return relationMap;
//    }

    private static int RNG() {
        Random rnd = new Random();
        return 50 + rnd.nextInt(51);
    }

    //This makes an observable list, which is the equivalent of a list with listeners
    private ObservableList<Student> generateStudents() {
        ObservableList<Student> student = FXCollections.observableArrayList();

        student.add(new Student("Student 1", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 2", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 3", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 4", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 5", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 6", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 7", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 8", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 9", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 10", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 11", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 12", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 13", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 14", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 15", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 16", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 17", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 18", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 19", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));
        student.add(new Student("Student 20", RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG(), RNG()));

//        student.add(new Student("Student 1", 100, RNG(), RNG(), RNG(), 50, 75, 87, 54, 81, 74, 84));
//        student.add(new Student("Student 2", 100, RNG(), RNG(), RNG(), 66, 89, 90, 91, 76, 86, 86));
//        student.add(new Student("Student 3", 100, RNG(), RNG(), RNG(), 76, 60, 84, 67, 64, 71, 78));
//        student.add(new Student("Student 4", 100, RNG(), RNG(), RNG(), 83, 99, 84, 91, 70, 99, 52));
//        student.add(new Student("Student 5", 100, RNG(), RNG(), RNG(), 78, 97, 65, 68, 79, 63, 94));
//        student.add(new Student("Student 6", 100, RNG(), RNG(), RNG(), 100, 95, 92, 98, 83, 56, 63));
//        student.add(new Student("Student 7", 100, RNG(), RNG(), RNG(), 62, 51, 76, 74, 93, 65, 57));
//        student.add(new Student("Student 8", 100, RNG(), RNG(), RNG(), 60, 89, 100, 97, 85, 90, 64));
//        student.add(new Student("Student 9", 100, RNG(), RNG(), RNG(), 94, 81, 73, 84, 56, 98, 68));
//        student.add(new Student("Student 10", 100, RNG(), RNG(), RNG(), 97, 94, 97, 53, 92, 65, 64));
//        student.add(new Student("Student 11", 100, RNG(), RNG(), RNG(), 73, 78, 85, 78, 75, 82, 88));
//        student.add(new Student("Student 12", 100, RNG(), RNG(), RNG(), 98, 82, 99, 62, 97, 52, 60));
//        student.add(new Student("Student 13", 100, RNG(), RNG(), RNG(), 72, 70, 53, 52, 98, 74, 77));
//        student.add(new Student("Student 14", 100, RNG(), RNG(), RNG(), 53, 88, 99, 56, 57, 69, 54));
//        student.add(new Student("Student 15", 100, RNG(), RNG(), RNG(), 53, 71, 70, 53, 74, 95, 57));
//        student.add(new Student("Student 16", 100, RNG(), RNG(), RNG(), 63, 82, 89, 68, 91, 86, 87));
//        student.add(new Student("Student 17", 100, RNG(), RNG(), RNG(), 91, 100, 57, 65, 57, 78, 83));
//        student.add(new Student("Student 18", 100, RNG(), RNG(), RNG(), 52, 55, 79, 89, 52, 76, 77));
//        student.add(new Student("Student 19", 100, RNG(), RNG(), RNG(), 62, 90, 87, 95, 84, 60, 77));
//        student.add(new Student("Student 20", 100, RNG(), RNG(), RNG(), 51, 87, 82, 51, 80, 97, 77));

        return student;
    }


    @FXML
    private Label MyMessage;
    @FXML
    private Label My2Message;

    @FXML
    private Label Act1Avg;
    @FXML
    private Label Act2Avg;
    @FXML
    private Label Act3Avg;
    @FXML
    private Label Act4Avg;
    @FXML
    private Label Act5Avg;
    @FXML
    private Label Act6Avg;
    @FXML
    private Label Act7Avg;
    @FXML
    private Label Act8Avg;
    @FXML
    private Label Act9Avg;

    @FXML
    private Label Act1Var;
    @FXML
    private Label Act2Var;
    @FXML
    private Label Act3Var;
    @FXML
    private Label Act4Var;
    @FXML
    private Label Act5Var;
    @FXML
    private Label Act6Var;
    @FXML
    private Label Act7Var;
    @FXML
    private Label Act8Var;
    @FXML
    private Label Act9Var;

    @FXML
    private Label Act1Std;
    @FXML
    private Label Act2Std;
    @FXML
    private Label Act3Std;
    @FXML
    private Label Act4Std;
    @FXML
    private Label Act5Std;
    @FXML
    private Label Act6Std;
    @FXML
    private Label Act7Std;
    @FXML
    private Label Act8Std;
    @FXML
    private Label Act9Std;
    @FXML
    private Label Top1;
    @FXML
    private Label Top2;
    @FXML
    private Label Top3;
    @FXML
    private Label Top4;
    @FXML
    private Label Top5;

    @FXML
    private Button Calculator;

    public void lostFocus(ActionEvent event) {
        Act1Avg.setText(Double.toString(getColumnAverage(1)));
        Act2Avg.setText(Double.toString(getColumnAverage(2)));
        Act3Avg.setText(Double.toString(getColumnAverage(3)));
        Act4Avg.setText(Double.toString(getColumnAverage(4)));
        Act5Avg.setText(Double.toString(getColumnAverage(5)));
        Act6Avg.setText(Double.toString(getColumnAverage(6)));
        Act7Avg.setText(Double.toString(getColumnAverage(7)));
        Act8Avg.setText(Double.toString(getColumnAverage(8)));
        Act9Avg.setText(Double.toString(getColumnAverage(9)));

        Act9Var.setText(Double.toString(getColumnVariance(9)));
        Act8Var.setText(Double.toString(getColumnVariance(8)));
        Act7Var.setText(Double.toString(getColumnVariance(7)));
        Act6Var.setText(Double.toString(getColumnVariance(6)));
        Act5Var.setText(Double.toString(getColumnVariance(5)));
        Act4Var.setText(Double.toString(getColumnVariance(4)));
        Act3Var.setText(Double.toString(getColumnVariance(3)));
        Act2Var.setText(Double.toString(getColumnVariance(2)));
        Act1Var.setText(Double.toString(getColumnVariance(1)));

        Act9Std.setText(Double.toString(getColumnStdDev(9)));
        Act8Std.setText(Double.toString(getColumnStdDev(8)));
        Act7Std.setText(Double.toString(getColumnStdDev(7)));
        Act6Std.setText(Double.toString(getColumnStdDev(6)));
        Act5Std.setText(Double.toString(getColumnStdDev(5)));
        Act4Std.setText(Double.toString(getColumnStdDev(4)));
        Act3Std.setText(Double.toString(getColumnStdDev(3)));
        Act2Std.setText(Double.toString(getColumnStdDev(2)));
        Act1Std.setText(Double.toString(getColumnStdDev(1)));

        calculateFnl();
        tableView.getColumns().get(0).setVisible(false);
        tableView.getColumns().get(0).setVisible(true);
//        Top1.setText(getTop5().get(1).toString());
//        Top2.setText(getTop5().get(2).toString());
//        Top3.setText(getTop5().get(3).toString());
//        Top4.setText(getTop5().get(4).toString());
//        Top5.setText(getTop5().get(5).toString());

    }
}
