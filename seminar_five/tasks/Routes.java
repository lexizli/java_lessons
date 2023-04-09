package seminar_five.tasks;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
 
public class Routes {
 
    private JTextField numberOfRouteTextField;
    private DefaultTableModel tableModel;
    private Frame frame;
    private ArrayList<String[]> dataOfTableAboutRoutes;
 
    public static void main(String args[]) {
 
        Routes routes = new Routes();
        routes.CreateGui();
    }
 
    private void CreateGui() {
 
        frame = new JFrame("Построение таблицы маршрутов");
        JLabel numberOfRoutesLabel;
        JPanel widgetPanel = new JPanel();                      // создаем панель, где будут располагаться все элементы
        widgetPanel.setPreferredSize(new Dimension(800, 600));
        widgetPanel.setOpaque(false);
        GridBagLayout gblWidgetPanel = new GridBagLayout();     // определяем менеджер компоновки
        GridBagConstraints constraints = new GridBagConstraints();
        widgetPanel.setLayout(gblWidgetPanel);
 
        numberOfRoutesLabel = new JLabel("Количество маршрутов:");
        constraints.gridwidth = 1;   // сколько ячеек занимает объект
        constraints.gridy = 0;       //  какая по-счету ячейка по вертикали
        gblWidgetPanel.setConstraints(numberOfRoutesLabel, constraints);
        widgetPanel.add(numberOfRoutesLabel);
 
        numberOfRouteTextField = new JTextField(10);
        constraints.gridy = 1;
        numberOfRouteTextField.addKeyListener(new NumberKeyListener()); // добавляем слушателя к TextField
        gblWidgetPanel.setConstraints(numberOfRouteTextField, constraints);
        widgetPanel.add(numberOfRouteTextField);           // размещаем на панели
 
        dataOfTableAboutRoutes = new ArrayList<>();   // здесь будет хранится все содержимое таблицы по строкам
        tableModel = new DefaultTableModel();
        JTable writingRoutesTable = new JTable(tableModel);
        constraints.gridy = 2;          // сколько ячеек занимает таблица
        gblWidgetPanel.setConstraints(writingRoutesTable, constraints);
        widgetPanel.add(writingRoutesTable);
 
        frame.add(BorderLayout.WEST,widgetPanel);
        
        frame.setVisible(true);
        frame.setResizable(true);
        frame.pack();
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        //frame.setSize(300, 300);
    }
 
    class NumberKeyListener extends KeyAdapter {   // расширяем абстрактный класс KeyAdapter
 
        public void keyReleased(KeyEvent event) {  // переопределяем необходимые методы
 
            // данный метод будет срабатывать после того, как пользователь введет любой символ с клавиатуры
            // в нашем случае неплохо было бы сделать проверку на вводимые данные, чтобы это были только целые числа
 
            if (event.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
 
                // если пользователь нажал BackSpace с желанием стереть содержимое, то тело функции не будет выполняться
 
                String[] columnNames = new String[]{"Номер маршрута", "Начало", "Конец"}; // задаем заголовки таблицы
                int numberOfRoutes = Integer.parseInt(numberOfRouteTextField.getText());  // получаем число из TextField
 
                for (int i = 0; i < dataOfTableAboutRoutes.size(); i++) {
                    tableModel.removeRow(0);
                    // после удаления элементы смещаются,поэтому мы каждый раз удаляем первый элемент
                }
                dataOfTableAboutRoutes.clear();  // очищаем содержимое таблицы
 
                for (int i = 1; i <= numberOfRoutes; i++) {
                    String[] temp = {"маршрут " + i, "",""};
                    dataOfTableAboutRoutes.add(temp); // заносим в таблицу число строк, равное заданному числу
                }
                tableModel.setColumnIdentifiers(columnNames); // устанавливаем в таблицу заголовки
                for (String[] dataOfTable : dataOfTableAboutRoutes) {
                    tableModel.addRow(dataOfTable);    // помещаем в таблицу содержимое из ArrayList
                }
            }
        }
    }
}
 
