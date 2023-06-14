import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

    public class GUIframe {

        private static JLabel userLabel;
        private static JLabel positionLabel;
        private static JTextField userText;
        private static JTextField positionText;
        private static JButton button;
        private static JLabel birthdayLabel;
        private static JTextField birthdayText;
        private static JLabel sssNumberLabel;
        private static JTextField sssNumberText;
        private static JLabel philhealthNumberLabel;
        private static JTextField philhealthNumberText;
        private static JLabel pagibigNumberLabel;
        private static JTextField pagibigNumberText;
        private static JLabel tinNumberLabel;
        private static JTextField tinNumberText;
        private static JLabel profileLabel;
        private static JLabel timeInLabel;
        private static JTextField timeInText;
        private static JLabel timeOutLabel;
        private static JTextField timeOutText;
        private static JLabel workingHoursLabel;
        private static JLabel weeklySalaryLabel;
        private static JLabel basicSalaryLabel;
        private static JLabel sssLabel;
        private static JLabel philhealthLabel;
        private static JLabel pagibigLabel;
        private static JLabel tinLabel;
        private static JLabel taxIncomeLabel;
        private static JLabel witHoldingTaxLabel;
        private static JLabel netSalaryLabel;
        private static JTextField workingHoursText;
        private static JTextField weeklySalaryText;
        private static JTextField basicSalaryText;
        private static JTextField sssText;
        private static JTextField philhealthText;
        private static JTextField pagibigText;
        private static JTextField tinText;
        private static JTextField taxIncomeText;
        private static JTextField witHoldingTaxText;
        private static JTextField netSalaryText;
        private static JLabel payrollLabel;
        private static JLabel monthLabel;
        private static JTextField monthText;
        private static JLabel yearLabel;
        private static JTextField yearText;
        private static JButton calculateButton;


        public static void main(String[] args) {

            JPanel panel = new JPanel();
            JFrame frame = new JFrame();
            frame.setSize(650, 650);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.add(panel);

            panel.setLayout(null);

            profileLabel = new JLabel("EMPLOYEE DETAILS");
            profileLabel.setBounds(20, 10, 200, 25);
            panel.add(profileLabel);

            userLabel = new JLabel("Employee No:");
            userLabel.setBounds(20, 40, 100, 25);
            panel.add(userLabel);

            userText = new JTextField();
            userText.setBounds(120, 40, 150, 25);
            panel.add(userText);

            payrollLabel = new JLabel("PAYROLL:");
            payrollLabel.setBounds(20, 120, 100, 25);
            panel.add(payrollLabel);

            monthLabel = new JLabel("Month:");
            monthLabel.setBounds(20, 150, 100, 25);
            panel.add(monthLabel);

            monthText = new JTextField();
            monthText.setBounds(120, 150, 150, 25);
            panel.add(monthText);

            yearLabel = new JLabel("Year:");
            yearLabel.setBounds(20, 180, 100, 25);
            panel.add(yearLabel);

            yearText = new JTextField();
            yearText.setBounds(120, 180, 150, 25);
            panel.add(yearText);

            calculateButton = new JButton("Calculate");
            calculateButton.setBounds(120, 220, 150, 25);
            panel.add(calculateButton);

            timeInLabel = new JLabel("Time In:");
            timeInLabel.setBounds(20, 300, 100, 25);
            panel.add(timeInLabel);

            timeInText = new JTextField();
            timeInText.setBounds(120, 300, 150, 25);
            panel.add(timeInText);

            timeOutLabel = new JLabel("Time Out:");
            timeOutLabel.setBounds(20, 330, 100, 25);
            panel.add(timeOutLabel);

            timeOutText = new JTextField();
            timeOutText.setBounds(120, 330, 150, 25);
            panel.add(timeOutText);

            workingHoursLabel = new JLabel("Working Hours:");
            workingHoursLabel.setBounds(20, 360, 100, 25);
            panel.add(workingHoursLabel);

            workingHoursText = new JTextField();
            workingHoursText.setBounds(120, 360, 150, 25);
            panel.add(workingHoursText);

            weeklySalaryLabel = new JLabel("Weekly Salary:");
            weeklySalaryLabel.setBounds(20, 390, 100, 25);
            panel.add(weeklySalaryLabel);

            weeklySalaryText = new JTextField();
            weeklySalaryText.setBounds(120, 390, 150, 25);
            panel.add(weeklySalaryText);

            basicSalaryLabel = new JLabel("Basic Salary:");
            basicSalaryLabel.setBounds(20, 420, 100, 25);
            panel.add(basicSalaryLabel);

            basicSalaryText = new JTextField();
            basicSalaryText.setBounds(120, 420, 150, 25);
            panel.add(basicSalaryText);

            sssLabel = new JLabel("SSS:");
            sssLabel.setBounds(20, 450, 100, 25);
            panel.add(sssLabel);

            sssText = new JTextField();
            sssText.setBounds(120, 450, 150, 25);
            panel.add(sssText);

            philhealthLabel = new JLabel("Philhealth:");
            philhealthLabel.setBounds(20, 480, 100, 25);
            panel.add(philhealthLabel);

            philhealthText = new JTextField();
            philhealthText.setBounds(120, 480, 150, 25);
            panel.add(philhealthText);

            pagibigLabel = new JLabel("Pag ibig:");
            pagibigLabel.setBounds(350, 300, 100, 25);
            panel.add(pagibigLabel);

            pagibigText = new JTextField();
            pagibigText.setBounds(450, 300, 150, 25);
            panel.add(pagibigText);

            tinLabel = new JLabel("TIN:");
            tinLabel.setBounds(350, 330, 100, 25);
            panel.add(tinLabel);

            tinText = new JTextField();
            tinText.setBounds(450, 330, 150, 25);
            panel.add(tinText);

            taxIncomeLabel = new JLabel("Tax Income:");
            taxIncomeLabel.setBounds(350, 360, 100, 25);
            panel.add(taxIncomeLabel);

            taxIncomeText = new JTextField();
            taxIncomeText.setBounds(450, 360, 150, 25);
            panel.add(taxIncomeText);

            witHoldingTaxLabel = new JLabel("Withholding Tax:");
            witHoldingTaxLabel.setBounds(350, 390, 100, 25);
            panel.add(witHoldingTaxLabel);

            witHoldingTaxText = new JTextField();
            witHoldingTaxText.setBounds(450, 390, 150, 25);
            panel.add(witHoldingTaxText);

            netSalaryLabel = new JLabel("Net Salary:");
            netSalaryLabel.setBounds(350, 420, 100, 25);
            panel.add(netSalaryLabel);

            netSalaryText = new JTextField();
            netSalaryText.setBounds(450, 420, 150, 25);
            panel.add(netSalaryText);

            monthLabel = new JLabel("Month:");
            monthLabel.setBounds(350, 450, 100, 25);
            panel.add(monthLabel);

            monthText = new JTextField();
            monthText.setBounds(450, 450, 150, 25);
            panel.add(monthText);

            try {
                BufferedReader reader = new BufferedReader(new FileReader("Attendance Record.csv"));
                String line;
                if ((line = reader.readLine()) != null) {
                    // Assuming the CSV file has a header row
                    String[] headers = line.split(",");
                    // Assuming the CSV file has the same order of columns as the UI components
                    String[] values = reader.readLine().split(",");

                    // Populate UI components with employee details
                    for (int i = 0; i < headers.length; i++) {
                        String header = headers[i];
                        String value = values[i];

                        if (header.equals("Employee No:")) {
                            userText.setText(value);
                        } else if (header.equals("Month:")) {
                            monthText.setText(value);
                            // Declare the month and use it as needed
                            Month month = Month.from(DateTimeFormatter.ofPattern("MM").parse(value));
                            // Example usage:
                            System.out.println("Month: " + month.toString());
                        } else if (header.equals("Year:")) {
                            yearText.setText(value);
                        } else if (header.equals("Time In:")) {
                            timeInText.setText(value);
                        } else if (header.equals("Time Out:")) {
                            timeOutText.setText(value);
                        }
                        // ... Populate other UI components with corresponding values
                    }
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


            calculateButton.addActionListener(e -> {
                String employeeNo = userText.getText();
                String timeIn = timeInText.getText();
                String timeOut = timeOutText.getText();
                String month = monthText.getText();



                // Calculate the working hours
                double workingHours = calculateWorkingHours(timeIn, timeOut);
                workingHoursText.setText(String.valueOf(workingHours));

                // Calculate other payroll components
                double weeklySalary = calculateWeeklySalary(workingHours);
                weeklySalaryText.setText(String.valueOf(weeklySalary));

                double basicSalary = calculateBasicSalary(weeklySalary);
                basicSalaryText.setText(String.valueOf(basicSalary));

                double sss = calculateSSS(basicSalary);
                sssText.setText(String.valueOf(sss));

                double philhealth = calculatePhilhealth(basicSalary);
                philhealthText.setText(String.valueOf(philhealth));

                double pagibig = calculatePagibig(basicSalary);
                pagibigText.setText(String.valueOf(pagibig));

                double taxIncome = calculateTaxIncome(basicSalary);
                taxIncomeText.setText(String.valueOf(taxIncome));

                double withholdingTax = calculateWithholdingTax(taxIncome);
                witHoldingTaxText.setText(String.valueOf(withholdingTax));

                double netSalary = calculateNetSalary(basicSalary, sss, philhealth, pagibig, withholdingTax);
                netSalaryText.setText(String.valueOf(netSalary));

                savePayrollToCSV(employeeNo, month, workingHours, weeklySalary, basicSalary, sss, philhealth, pagibig,
                        taxIncome, withholdingTax, netSalary);
            });
        }

        private static double calculateWorkingHours(String timeIn, String timeOut) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime startTime = LocalTime.parse(timeIn, formatter);
            LocalTime endTime = LocalTime.parse(timeOut, formatter);

            long minutes = startTime.until(endTime, ChronoUnit.MINUTES);
            double workingHours = minutes / 60.0;

            return workingHours;
        }

        private static double calculateWeeklySalary(double workingHours) {
            // Implement the logic to calculate the weekly salary based on the working hours
            // Return the calculated weekly salary
            // You can use the employee's hourly rate and multiply it by the working hours
            // For simplicity, let's assume an hourly rate of $10
            double hourlyRate = 10.0;
            return workingHours * hourlyRate;
        }

        private static double calculateBasicSalary(double weeklySalary) {
            // Implement the logic to calculate the basic salary based on the weekly salary
            // Return the calculated basic salary
            // You can consider factors like the number of weeks in a month or a fixed monthly rate
            // For simplicity, let's assume a monthly rate of 4 weeks
            int numberOfWeeksInMonth = 4;
            return weeklySalary * numberOfWeeksInMonth;
        }

        private static double calculateSSS(double basicSalary) {
            // Implement the logic to calculate the SSS contribution based on the basic salary
            // Return the calculated SSS contribution
            // You can refer to the SSS contribution table or use a fixed percentage of the basic salary
            // For simplicity, let's assume a fixed SSS contribution of 10% of the basic salary
            double sssContributionPercentage = 0.1;
            return basicSalary * sssContributionPercentage;
        }

        private static double calculatePhilhealth(double basicSalary) {
            // Implement the logic to calculate the Philhealth contribution based on the basic salary
            // Return the calculated Philhealth contribution
            // You can refer to the Philhealth contribution table or use a fixed percentage of the basic salary
            // For simplicity, let's assume a fixed Philhealth contribution of 5% of the basic salary
            double philhealthContributionPercentage = 0.05;
            return basicSalary * philhealthContributionPercentage;
        }

        private static double calculatePagibig(double basicSalary) {
            // Implement the logic to calculate the Pag-IBIG contribution based on the basic salary
            // Return the calculated Pag-IBIG contribution
            // You can refer to the Pag-IBIG contribution table or use a fixed percentage of the basic salary
            // For simplicity, let's assume a fixed Pag-IBIG contribution of 2% of the basic salary
            double pagibigContributionPercentage = 0.02;
            return basicSalary * pagibigContributionPercentage;
        }

        private static double calculateTaxIncome(double basicSalary) {
            // Implement the logic to calculate the taxable income based on the basic salary
            // Return the calculated taxable income
            // You can consider factors like tax brackets, exemptions, and deductions
            // For simplicity, let's assume a fixed taxable income equal to the basic salary
            return basicSalary;
        }

        private static double calculateWithholdingTax(double taxIncome) {
            // Implement the logic to calculate the withholding tax based on the taxable income
            // Return the calculated withholding tax
            // You can refer to the tax tables or use a fixed tax rate
            // For simplicity, let's assume a fixed tax rate of 10% of the taxable income
            double withholdingTaxRate = 0.1;
            return taxIncome * withholdingTaxRate;
        }

        private static double calculateNetSalary(double basicSalary, double sss, double philhealth, double pagibig,
                                                 double withholdingTax) {
            // Implement the logic to calculate the net salary based on the basic salary, deductions, and taxes
            // Return the calculated net salary
            return basicSalary - (sss + philhealth + pagibig + withholdingTax);
        }

        private static void savePayrollToCSV(String employeeNo, String month, double workingHours, double weeklySalary,
                                             double basicSalary, double sss, double philhealth, double pagibig,
                                             double taxIncome, double withholdingTax, double netSalary) {
            try {
                FileWriter writer = new FileWriter("payroll.csv", true);
                writer.write(employeeNo + "," + month + "," + workingHours + "," + weeklySalary + "," + basicSalary + ","
                        + sss + "," + philhealth + "," + pagibig + "," + taxIncome + "," + withholdingTax + ","
                        + netSalary + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }