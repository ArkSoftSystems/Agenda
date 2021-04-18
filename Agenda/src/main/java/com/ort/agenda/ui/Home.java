/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.agenda.ui;

import com.ort.agenda.ui.components.CustomAlertSignIn;
import com.ort.agenda.utils.FieldUtils;
import com.ort.agenda.utils.FontUtils;
import com.ort.agenda.utils.ImageUtils;
import com.ort.agenda.utils.SessionUtils;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicButtonUI;
import uy.edu.ort.agendaswing.dominio.Usuario;
import uy.edu.ort.agendaswing.logica.FachadaServicios;

/**
 *
 * @author matiasc
 */
public class Home extends javax.swing.JFrame {

    Usuario usuario;

    private static final String REGULAR_FONT = "Roboto-Regular";
    private static final String THIN_FONT = "Roboto-Thin";
    private static final String HOME_IMAGE = "home-6.png";
    private static final Color DASHBOARD_RIGHT_COLOR = new Color(29, 29, 29);
    private static final Color DASHBOARD_LEFTH_COLOR = new Color(20, 20, 20);
    private static final Color WHITE_BUTTON_HOVER = new Color(255, 255, 255);
    private static final Color WHITE_TEXT_ALERT = new Color(244, 244, 244);

    /**
     * Creates new form Home
     */
    public Home(Usuario usuario) {
        initComponents();
        setRelativeLocaltion();

        this.usuario = usuario;

        jpInsideImage.add(ImageUtils.getJLabelImage(HOME_IMAGE));
        jTitle.setFont(FontUtils.getCustomFont(THIN_FONT, 48f));
        jlPrincipalSubTitle.setFont(FontUtils.getCustomFont(THIN_FONT, 18f));
        jlLoginTitle.setFont(FontUtils.getCustomFont(REGULAR_FONT, 28f));
        jlUsername.setFont(FontUtils.getCustomFont(REGULAR_FONT, 12f));
        jlPassword.setFont(FontUtils.getCustomFont(REGULAR_FONT, 12f));
        jButtonLogIn.setBackground(DASHBOARD_RIGHT_COLOR);
        jButtonLogIn.setUI(new BasicButtonUI());

        jButtonLogIn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jButtonLogIn.setBackground(WHITE_BUTTON_HOVER);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jButtonLogIn.setBackground(DASHBOARD_RIGHT_COLOR);
            }
        });

        JButton[] buttons = {
            jButtonLogout, jButtonCreate, jButtonSearchContact, jButtonHome
        };

        for (JButton jbtn : buttons) {
            jbtn.setBackground(DASHBOARD_RIGHT_COLOR);
            jbtn.setUI(new BasicButtonUI());
            jbtn.addMouseListener(new MouseListener() {

                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    jbtn.setBackground(DASHBOARD_LEFTH_COLOR);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    jbtn.setBackground(DASHBOARD_RIGHT_COLOR);
                }
            });
        }

        if (SessionUtils.checkLogin(this.usuario)) {
            jpLogin.setVisible(false);
            jpImage.setVisible(false);
            jPanelLoginContainer.setVisible(false);

            jpHomeContainer.setLayout(new FlowLayout());
            jpHomeContainer.add(ImageUtils.getJLabelImage("home-7.png"));
            jpHomeContainer.updateUI();
        }
    }

    private void setRelativeLocaltion() {
        this.setLocationRelativeTo(null);
    }

    private int getLocationX() {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        return (screenSize.width - this.getWidth()) / 2;
    }

    private int getLocaltionY() {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        return (screenSize.height - this.getHeight()) / 2;
    }

    private void signIn() {
        String password = new String(jPasswordField.getPassword());
        String username = jtfUsername.getText();
        usuario = FachadaServicios.getInstance().login(username, password);

        if (!SessionUtils.checkLogin(usuario)) {
            setAlertBorderLogin();
            addWarningMessageLogin("* Invalid mail or password");
            showWarningMessageLogin();
        } else {
            new Agenda(usuario).setVisible(true);
            this.setVisible(false);
        }
    }

    public void showWarningMessageLogin() {
        CustomAlertSignIn customAlertSignIn = new CustomAlertSignIn(this, true);
        customAlertSignIn.setRelativeCenterPosition();
        customAlertSignIn.setVisible(true);
    }

    public void addWarningMessageLogin(String message) {
        JLabel jLabel = FieldUtils.addWarningMessage(message);
        cleanSignInAlertMessages();
        jpLoginMessage.add(jLabel);
        jpLoginMessage.updateUI();
    }

    public void setAlertBorderLogin() {
        jtfUsername.setBorder(BorderFactory.createLineBorder(WHITE_TEXT_ALERT));
        jPasswordField.setBorder(BorderFactory.createLineBorder(WHITE_TEXT_ALERT));
    }

    public void cleanSignInAlertMessages() {
        jpLoginMessage.removeAll();
        jpLoginMessage.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        jpPrincipalButton = new javax.swing.JPanel();
        jButtonHome = new javax.swing.JButton();
        jpSecondaryButton = new javax.swing.JPanel();
        jButtonCreate = new javax.swing.JButton();
        jButtonSearchContact = new javax.swing.JButton();
        jpLogout = new javax.swing.JPanel();
        jButtonLogout = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        jpSubTitle = new javax.swing.JPanel();
        jlPrincipalSubTitle = new javax.swing.JLabel();
        jpTitle = new javax.swing.JPanel();
        jTitle = new javax.swing.JLabel();
        jpHomeContainer = new javax.swing.JPanel();
        jPanelLoginContainer = new javax.swing.JPanel();
        jpDinamicPanel = new javax.swing.JPanel();
        jpLogin = new javax.swing.JPanel();
        jpLoginTitle = new javax.swing.JPanel();
        jlLoginTitle = new javax.swing.JLabel();
        jpLoginContainer = new javax.swing.JPanel();
        jtfUsername = new javax.swing.JTextField();
        jlUsername = new javax.swing.JLabel();
        jlPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonLogIn = new javax.swing.JButton();
        jlNoAccount = new javax.swing.JLabel();
        jlCreateAccount = new javax.swing.JLabel();
        jpLoginMessage = new javax.swing.JPanel();
        jpImage = new javax.swing.JPanel();
        jpInsideImage = new javax.swing.JPanel();
        jpVersionContainer = new javax.swing.JPanel();
        jlVersion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 820));
        setResizable(false);

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSide.setBackground(new java.awt.Color(20, 20, 20));
        pnlSide.setPreferredSize(new java.awt.Dimension(90, 0));

        jpPrincipalButton.setBackground(new java.awt.Color(20, 20, 20));
        jpPrincipalButton.setPreferredSize(new java.awt.Dimension(80, 160));
        jpPrincipalButton.setLayout(new java.awt.GridBagLayout());

        jButtonHome.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHome.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_20px.png"))); // NOI18N
        jButtonHome.setAlignmentX(2.0F);
        jButtonHome.setPreferredSize(new java.awt.Dimension(60, 60));
        jpPrincipalButton.add(jButtonHome, new java.awt.GridBagConstraints());

        pnlSide.add(jpPrincipalButton);

        jpSecondaryButton.setBackground(new java.awt.Color(20, 20, 20));
        jpSecondaryButton.setPreferredSize(new java.awt.Dimension(80, 200));
        jpSecondaryButton.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 25));

        jButtonCreate.setBackground(new java.awt.Color(29, 29, 29));
        jButtonCreate.setForeground(new java.awt.Color(20, 20, 20));
        jButtonCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/contact_20px.png"))); // NOI18N
        jButtonCreate.setAlignmentX(2.0F);
        jButtonCreate.setPreferredSize(new java.awt.Dimension(60, 60));
        jButtonCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateMouseClicked(evt);
            }
        });
        jpSecondaryButton.add(jButtonCreate);

        jButtonSearchContact.setBackground(new java.awt.Color(29, 29, 29));
        jButtonSearchContact.setForeground(new java.awt.Color(20, 20, 20));
        jButtonSearchContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/find_user_male_20px.png"))); // NOI18N
        jButtonSearchContact.setPreferredSize(new java.awt.Dimension(60, 60));
        jButtonSearchContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSearchContactMouseClicked(evt);
            }
        });
        jpSecondaryButton.add(jButtonSearchContact);

        pnlSide.add(jpSecondaryButton);

        jpLogout.setBackground(new java.awt.Color(20, 20, 20));

        jButtonLogout.setBackground(new java.awt.Color(29, 29, 29));
        jButtonLogout.setForeground(new java.awt.Color(20, 20, 20));
        jButtonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_rounded_up_20px.png"))); // NOI18N
        jButtonLogout.setPreferredSize(new java.awt.Dimension(60, 60));
        jButtonLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpLogoutLayout = new javax.swing.GroupLayout(jpLogout);
        jpLogout.setLayout(jpLogoutLayout);
        jpLogoutLayout.setHorizontalGroup(
            jpLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jpLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpLogoutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpLogoutLayout.setVerticalGroup(
            jpLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
            .addGroup(jpLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpLogoutLayout.createSequentialGroup()
                    .addGap(0, 31, Short.MAX_VALUE)
                    .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 32, Short.MAX_VALUE)))
        );

        pnlSide.add(jpLogout);

        pnlRoot.add(pnlSide, java.awt.BorderLayout.WEST);

        pnlCenter.setBackground(new java.awt.Color(29, 29, 29));
        pnlCenter.setPreferredSize(new java.awt.Dimension(0, 60));

        jpSubTitle.setBackground(new java.awt.Color(29, 29, 29));
        jpSubTitle.setLayout(new java.awt.GridLayout(1, 0));

        jlPrincipalSubTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlPrincipalSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlPrincipalSubTitle.setText("The most awesome phone book system");
        jpSubTitle.add(jlPrincipalSubTitle);

        jpTitle.setBackground(new java.awt.Color(29, 29, 29));
        jpTitle.setLayout(new java.awt.GridLayout(1, 0));

        jTitle.setFont(new java.awt.Font("Tahoma", 0, 58)); // NOI18N
        jTitle.setForeground(new java.awt.Color(204, 204, 204));
        jTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTitle.setText("Overview");
        jpTitle.add(jTitle);

        jpHomeContainer.setBackground(new java.awt.Color(29, 29, 29));

        jPanelLoginContainer.setBackground(new java.awt.Color(29, 29, 29));

        jpDinamicPanel.setBackground(new java.awt.Color(29, 29, 29));

        jpLogin.setBackground(new java.awt.Color(29, 29, 29));
        jpLogin.setForeground(new java.awt.Color(29, 29, 29));

        jpLoginTitle.setBackground(new java.awt.Color(29, 29, 29));
        jpLoginTitle.setLayout(new java.awt.GridLayout(1, 0));

        jlLoginTitle.setBackground(new java.awt.Color(29, 29, 29));
        jlLoginTitle.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jlLoginTitle.setForeground(new java.awt.Color(204, 204, 204));
        jlLoginTitle.setText("Sign in");
        jpLoginTitle.add(jlLoginTitle);

        jpLoginContainer.setBackground(new java.awt.Color(29, 29, 29));
        jpLoginContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpLoginContainer.setForeground(new java.awt.Color(204, 204, 204));

        jtfUsername.setBackground(new java.awt.Color(29, 29, 29));
        jtfUsername.setForeground(new java.awt.Color(153, 153, 153));
        jtfUsername.setToolTipText("");
        jtfUsername.setSelectionColor(new java.awt.Color(0, 51, 204));

        jlUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlUsername.setForeground(new java.awt.Color(204, 204, 204));
        jlUsername.setText("Username");

        jlPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlPassword.setForeground(new java.awt.Color(204, 204, 204));
        jlPassword.setText("Password");

        jPasswordField.setBackground(new java.awt.Color(29, 29, 29));
        jPasswordField.setForeground(new java.awt.Color(153, 153, 153));

        jButtonLogIn.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLogIn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login_50px_outline.png"))); // NOI18N
        jButtonLogIn.setPreferredSize(new java.awt.Dimension(60, 60));
        jButtonLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogInMouseClicked(evt);
            }
        });

        jlNoAccount.setForeground(new java.awt.Color(204, 204, 204));
        jlNoAccount.setText("No account? ");

        jlCreateAccount.setForeground(new java.awt.Color(0, 153, 255));
        jlCreateAccount.setText("Create one!");

        jpLoginMessage.setBackground(new java.awt.Color(29, 29, 29));
        jpLoginMessage.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout jpLoginContainerLayout = new javax.swing.GroupLayout(jpLoginContainer);
        jpLoginContainer.setLayout(jpLoginContainerLayout);
        jpLoginContainerLayout.setHorizontalGroup(
            jpLoginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginContainerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpLoginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpLoginContainerLayout.createSequentialGroup()
                        .addComponent(jlNoAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCreateAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpLoginContainerLayout.createSequentialGroup()
                        .addGroup(jpLoginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlUsername)
                            .addComponent(jlPassword))
                        .addGap(29, 29, 29)
                        .addGroup(jpLoginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpLoginMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(jtfUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(jPasswordField))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jpLoginContainerLayout.setVerticalGroup(
            jpLoginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginContainerLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jpLoginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpLoginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jlPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpLoginMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpLoginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLoginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlNoAccount)
                        .addComponent(jlCreateAccount)))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jpLoginLayout = new javax.swing.GroupLayout(jpLogin);
        jpLogin.setLayout(jpLoginLayout);
        jpLoginLayout.setHorizontalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addComponent(jpLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpLoginContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jpLoginLayout.setVerticalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addComponent(jpLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jpLoginContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jpDinamicPanel.add(jpLogin);

        javax.swing.GroupLayout jPanelLoginContainerLayout = new javax.swing.GroupLayout(jPanelLoginContainer);
        jPanelLoginContainer.setLayout(jPanelLoginContainerLayout);
        jPanelLoginContainerLayout.setHorizontalGroup(
            jPanelLoginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginContainerLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jpDinamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelLoginContainerLayout.setVerticalGroup(
            jPanelLoginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpDinamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jpImage.setBackground(new java.awt.Color(29, 29, 29));
        jpImage.setForeground(new java.awt.Color(29, 29, 29));
        jpImage.setLayout(new java.awt.GridLayout(1, 0));

        jpInsideImage.setBackground(new java.awt.Color(29, 29, 29));
        jpInsideImage.setToolTipText("");
        jpImage.add(jpInsideImage);

        javax.swing.GroupLayout jpHomeContainerLayout = new javax.swing.GroupLayout(jpHomeContainer);
        jpHomeContainer.setLayout(jpHomeContainerLayout);
        jpHomeContainerLayout.setHorizontalGroup(
            jpHomeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHomeContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLoginContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpImage, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpHomeContainerLayout.setVerticalGroup(
            jpHomeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHomeContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpHomeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLoginContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpVersionContainer.setBackground(new java.awt.Color(29, 29, 29));

        jlVersion.setBackground(new java.awt.Color(30, 30, 30));
        jlVersion.setForeground(new java.awt.Color(82, 82, 82));
        jlVersion.setText("Version 1.0.0");

        javax.swing.GroupLayout jpVersionContainerLayout = new javax.swing.GroupLayout(jpVersionContainer);
        jpVersionContainer.setLayout(jpVersionContainerLayout);
        jpVersionContainerLayout.setHorizontalGroup(
            jpVersionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVersionContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlVersion)
                .addContainerGap())
        );
        jpVersionContainerLayout.setVerticalGroup(
            jpVersionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVersionContainerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlVersion)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpHomeContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 670, Short.MAX_VALUE))
                    .addComponent(jpVersionContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpHomeContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jpVersionContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogInMouseClicked
        signIn();
    }//GEN-LAST:event_jButtonLogInMouseClicked

    private void jButtonCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateMouseClicked
        if (SessionUtils.checkLogin(usuario)) {
            new Agenda(usuario).setVisible(true);
            this.setVisible(false);
        } else {
            addWarningMessageLogin("Please to enter in create contact you must first be logged in");
        }
    }//GEN-LAST:event_jButtonCreateMouseClicked

    private void jButtonSearchContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSearchContactMouseClicked
        if (SessionUtils.checkLogin(usuario)) {
            new Agenda(usuario).setVisible(true);
            this.setVisible(false);
        } else {
            addWarningMessageLogin("Please to enter in contact search you must first be logged in");
        }
    }//GEN-LAST:event_jButtonSearchContactMouseClicked

    private void jButtonLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogoutMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonLogoutMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonSearchContact;
    private javax.swing.JPanel jPanelLoginContainer;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel jTitle;
    private javax.swing.JLabel jlCreateAccount;
    private javax.swing.JLabel jlLoginTitle;
    private javax.swing.JLabel jlNoAccount;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlPrincipalSubTitle;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JLabel jlVersion;
    private javax.swing.JPanel jpDinamicPanel;
    private javax.swing.JPanel jpHomeContainer;
    private javax.swing.JPanel jpImage;
    private javax.swing.JPanel jpInsideImage;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JPanel jpLoginContainer;
    private javax.swing.JPanel jpLoginMessage;
    private javax.swing.JPanel jpLoginTitle;
    private javax.swing.JPanel jpLogout;
    private javax.swing.JPanel jpPrincipalButton;
    private javax.swing.JPanel jpSecondaryButton;
    private javax.swing.JPanel jpSubTitle;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JPanel jpVersionContainer;
    private javax.swing.JTextField jtfUsername;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    // End of variables declaration//GEN-END:variables
}
