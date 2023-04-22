
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IncomeTaxCalculator extends JFrame implements ActionListener {
    private JLabel incomeLabel, deductionLabel, taxLabel;
    private JTextField incomeTextField;
    private JCheckBox basicDeductionCheckBox, medicalInsuranceCheckBox, educationalLoanCheckBox, npsContributionCheckBox, depositInterestCheckBox, charityDonationCheckBox, housingLoanInterestCheckBox;
    private JButton calculateButton;

    public IncomeTaxCalculator() {
        setTitle("Income Tax Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        incomeLabel = new JLabel("Enter your income:");
        deductionLabel = new JLabel("Select tax deductions:");
        taxLabel = new JLabel("");

        incomeTextField = new JTextField(10);

        basicDeductionCheckBox = new JCheckBox("Basic Deductions - 80C");
        medicalInsuranceCheckBox = new JCheckBox("Medical Insurance - 80D");
        educationalLoanCheckBox = new JCheckBox("Interest on Educational loan - 80E");
        npsContributionCheckBox = new JCheckBox("Employee's contribution to NPS - 80CCD");
        depositInterestCheckBox = new JCheckBox("Interest from Deposits - 80TTA");
        charityDonationCheckBox = new JCheckBox("Donations to charity - 80G");
        housingLoanInterestCheckBox = new JCheckBox("Interest on Housing Loan - 80EEA");

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(8, 1));
        mainPanel.add(incomeLabel);
        mainPanel.add(incomeTextField);
        mainPanel.add(deductionLabel);
        mainPanel.add(basicDeductionCheckBox);
        mainPanel.add(medicalInsuranceCheckBox);
        mainPanel.add(educationalLoanCheckBox);
        mainPanel.add(npsContributionCheckBox);
        mainPanel.add(depositInterestCheckBox);
        mainPanel.add(charityDonationCheckBox);
        mainPanel.add(housingLoanInterestCheckBox);
        mainPanel.add(calculateButton);
        mainPanel.add(taxLabel);

        add(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int income = Integer.parseInt(incomeTextField.getText());
        double tax = 0.0;
        if (basicDeductionCheckBox.isSelected()) {
            tax += Math.min(150000, 0.5 * income);
        }
        if (medicalInsuranceCheckBox.isSelected()) {
            tax += Math.min(25000, 0.1 * income);
        }
        if (educationalLoanCheckBox.isSelected()) {
            tax += Math.min(50000, 0.1 * income);
        }
        if (npsContributionCheckBox.isSelected()) {
            tax += Math.min(50000, 0.1 * income);
        }
        if (depositInterestCheckBox.isSelected()) {
            tax += Math.min(10000, 0.1 * income);
        }
        if (charityDonationCheckBox.isSelected()) {
            tax += Math.min(10000, 0.5 * income);
        }
        if (housingLoanInterestCheckBox.isSelected()) {
            tax += Math.min(150000, 0.5 * income);
        }
        tax = Math.min(tax, 0.3 * income);
        taxLabel.setText("Tax payable: " + tax);
    }

    public static void main(String[] args) {
        new IncomeTaxCalculator();
    }
}
