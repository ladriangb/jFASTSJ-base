package com.jswitch.siniestros.vista.detalle;

import com.jswitch.base.controlador.documentosAnexos.TipoDocumentoLookupController;
import com.jswitch.base.controlador.util.DefaultDocumentosAnexosGridController;
import com.jswitch.base.controlador.util.DefaultGridInternalController;
import com.jswitch.base.modelo.entidades.Documento;
import com.jswitch.base.modelo.entidades.NotaTecnica;
import com.jswitch.base.modelo.entidades.Observacion;
import com.jswitch.base.modelo.util.bean.BeanVO;
import com.jswitch.base.vista.util.DefaultDetailFrame;
import com.jswitch.fas.modelo.Dominios;
import com.jswitch.pagos.modelo.maestra.Pago;
import com.jswitch.persona.controlador.PersonaLookupControllerPorNombre;
import com.jswitch.persona.controlador.PersonasDetailController;
import com.jswitch.persona.modelo.maestra.Rif;
import com.jswitch.reporte.modelo.Reporte;
import com.jswitch.siniestros.controlador.SiniestroLookupController;
import com.jswitch.siniestros.controlador.PersonaTipoLookupController;
import com.jswitch.siniestros.controlador.detalle.ReembolsoDetailFrameController;
import com.jswitch.siniestros.controlador.detalle.reportes.ReporteGridInternalController;
import com.jswitch.siniestros.modelo.dominio.EtapaSiniestro;
import com.jswitch.siniestros.modelo.dominio.TipoSiniestro;
import com.jswitch.siniestros.modelo.maestra.DetalleSiniestro;
import com.jswitch.siniestros.modelo.maestra.detalle.Reembolso;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.form.client.Form;
import org.openswing.swing.form.client.FormController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.util.java.Consts;

/**
 *
 * @author Luis Adrian
 */
public class ReembolsoDetailFrame extends DefaultDetailFrame {

    protected DefaultDocumentosAnexosGridController controllerDocumentosAnexosX;
    protected DefaultGridInternalController controllerObservaciones;
    protected DefaultGridInternalController controllerNotasTecnicas;
    protected DefaultGridInternalController controllerReportes;
    protected DefaultGridInternalController controllerPagos;
    private PersonaTipoLookupController lookupPersonaPago = new PersonaTipoLookupController();

    public ReembolsoDetailFrame() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        editButton1 = new org.openswing.swing.client.EditButton();
        saveButton1 = new org.openswing.swing.client.SaveButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        form1 = new org.openswing.swing.form.client.Form();
        jPanel2 = new javax.swing.JPanel();
        labelControl3 = new org.openswing.swing.client.LabelControl();
        labelControl1 = new org.openswing.swing.client.LabelControl();
        labelControl2 = new org.openswing.swing.client.LabelControl();
        labelControl4 = new org.openswing.swing.client.LabelControl();
        dateControl1 = new org.openswing.swing.client.DateControl();
        dateControl2 = new org.openswing.swing.client.DateControl();
        codLookupControl1 = new org.openswing.swing.client.CodLookupControl();
        textControl1 = new org.openswing.swing.client.TextControl();
        codLookupControl3 = new org.openswing.swing.client.CodLookupControl();
        labelControl8 = new org.openswing.swing.client.LabelControl();
        labelControl9 = new org.openswing.swing.client.LabelControl();
        comboBoxControl1 = new org.openswing.swing.client.ComboBoxControl();
        codLookupControl4 = new org.openswing.swing.client.CodLookupControl();
        labelControl10 = new org.openswing.swing.client.LabelControl();
        dateControl3 = new org.openswing.swing.client.DateControl();
        labelControl12 = new org.openswing.swing.client.LabelControl();
        textControl2 = new org.openswing.swing.client.TextControl();
        codLookupControl2 = new org.openswing.swing.client.CodLookupControl();
        labelControl11 = new org.openswing.swing.client.LabelControl();
        labelControl5 = new org.openswing.swing.client.LabelControl();
        checkBoxControl1 = new org.openswing.swing.client.CheckBoxControl();
        jPanel7 = new javax.swing.JPanel();
        gridControl6 = new org.openswing.swing.client.GridControl();
        decimalColumn6 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn6 = new org.openswing.swing.table.columns.client.TextColumn();
        dateColumn1 = new org.openswing.swing.table.columns.client.DateColumn();
        dateColumn2 = new org.openswing.swing.table.columns.client.DateColumn();
        checkBoxColumn1 = new org.openswing.swing.table.columns.client.CheckBoxColumn();
        textColumn10 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn5 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        textColumn11 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn6 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        jPanel16 = new javax.swing.JPanel();
        insertButton8 = new org.openswing.swing.client.InsertButton();
        editButton7 = new org.openswing.swing.client.EditButton();
        deleteButton7 = new org.openswing.swing.client.DeleteButton();
        saveButton8 = new org.openswing.swing.client.SaveButton();
        reloadButton8 = new org.openswing.swing.client.ReloadButton();
        filterButton6 = new org.openswing.swing.client.FilterButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        gridControl4 = new org.openswing.swing.client.GridControl();
        decimalColumn4 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumn1 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn8 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn1 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        textColumn4 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn2 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        jPanel13 = new javax.swing.JPanel();
        insertButton6 = new org.openswing.swing.client.InsertButton();
        editButton6 = new org.openswing.swing.client.EditButton();
        deleteButton6 = new org.openswing.swing.client.DeleteButton();
        saveButton6 = new org.openswing.swing.client.SaveButton();
        reloadButton6 = new org.openswing.swing.client.ReloadButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        gridControl5 = new org.openswing.swing.client.GridControl();
        decimalColumn5 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn9 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn3 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        textColumn5 = new org.openswing.swing.table.columns.client.TextColumn();
        dateTimeColumn4 = new org.openswing.swing.table.columns.client.DateTimeColumn();
        jPanel15 = new javax.swing.JPanel();
        insertButton7 = new org.openswing.swing.client.InsertButton();
        saveButton7 = new org.openswing.swing.client.SaveButton();
        reloadButton7 = new org.openswing.swing.client.ReloadButton();
        jPanel4 = new javax.swing.JPanel();
        gridReportes = new org.openswing.swing.client.GridControl();
        textColumn12 = new org.openswing.swing.table.columns.client.TextColumn();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        gridControl3 = new org.openswing.swing.client.GridControl();
        buttonColumn1 = new org.openswing.swing.table.columns.client.ButtonColumn();
        integerColumn1 = new org.openswing.swing.table.columns.client.IntegerColumn();
        codLookupColumn2 = new org.openswing.swing.table.columns.client.CodLookupColumn();
        textColumn7 = new org.openswing.swing.table.columns.client.TextColumn();
        dateColumn3 = new org.openswing.swing.table.columns.client.DateColumn();
        jPanel11 = new javax.swing.JPanel();
        insertButton5 = new org.openswing.swing.client.InsertButton();
        editButton5 = new org.openswing.swing.client.EditButton();
        deleteButton5 = new org.openswing.swing.client.DeleteButton();
        saveButton5 = new org.openswing.swing.client.SaveButton();
        reloadButton5 = new org.openswing.swing.client.ReloadButton();
        filterButton5 = new org.openswing.swing.client.FilterButton();

        setTitle("Reembolso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(573, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        form1.setVOClassName(Reembolso.class.getName());
        form1.setEditButton(editButton1);
        form1.setSaveButton(saveButton1);
        form1.setLayout(new java.awt.GridLayout(1, 0));

        labelControl3.setLabel("detalleSiniestro.personaPago");

        labelControl1.setLabel("detalleSiniestro.TipoPersona");

        labelControl2.setLabel("detalleSiniestro.fechaOcurrencia");

        labelControl4.setLabel("detalleSiniestro.fechaNotificacion");

        dateControl1.setAttributeName("fechaOcurrencia");
        dateControl1.setRequired(true);

        dateControl2.setAttributeName("fechaNotificacion");
        dateControl2.setRequired(true);

        codLookupControl1.setAttributeName("personaPago.nombreLargo");
        codLookupControl1.setEnabledOnEdit(false);
        codLookupControl1.setEnabledOnInsert(false);
        codLookupControl1.setMaxCharacters(30);

        textControl1.setAttributeName("tipoPersona.nombre");
        textControl1.setEnabled(false);
        textControl1.setEnabledOnEdit(false);
        textControl1.setEnabledOnInsert(false);

        codLookupControl3.setAttributeName("tipoSiniestro.nombre");
        codLookupControl3.setRequired(true);

        labelControl8.setLabel("detalleSiniestro.tratamientoEfectuado");

        labelControl9.setLabel("detalleSiniestro.tipoSiniestro");

        comboBoxControl1.setAttributeName("tratamientoEfectuado");
        comboBoxControl1.setDomainId(Dominios.TratamientoEfectuado().getDomainId());
        comboBoxControl1.setRequired(true);

        codLookupControl4.setAttributeName("etapaSiniestro.nombre");
        codLookupControl4.setEnableCodBox(false);
        codLookupControl4.setEnabledOnInsert(false);

        labelControl10.setLabel("detalleSiniestro.etapaSiniestro");

        dateControl3.setAttributeName("fechaConstitucion");
        dateControl3.setRequired(true);

        labelControl12.setLabel("detalleSiniestro.fechaConstitucion");

        textControl2.setAttributeName("siniestro.numero");
        textControl2.setEnabled(false);
        textControl2.setEnabledOnEdit(false);
        textControl2.setEnabledOnInsert(false);

        codLookupControl2.setAttributeName("analistaNegociador.nombreLargo");
        codLookupControl2.setMaxCharacters(30);
        codLookupControl2.setRequired(true);

        labelControl11.setLabel("siniestro.numero");

        labelControl5.setLabel("analistaNegociador");

        checkBoxControl1.setText("auditoria.activo");
        checkBoxControl1.setAttributeName("auditoria.activo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateControl2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(dateControl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(codLookupControl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateControl3, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelControl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelControl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codLookupControl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(comboBoxControl1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(codLookupControl3, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(codLookupControl4, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textControl2, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                    .addComponent(checkBoxControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelControl1, labelControl10, labelControl11, labelControl12, labelControl2, labelControl3, labelControl4, labelControl5, labelControl8, labelControl9});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codLookupControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelControl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dateControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelControl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateControl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLookupControl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelControl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLookupControl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelControl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codLookupControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelControl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textControl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxControl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {codLookupControl1, codLookupControl2, codLookupControl3, codLookupControl4, comboBoxControl1, dateControl1, dateControl2, labelControl1, labelControl10, labelControl11, labelControl12, labelControl2, labelControl3, labelControl4, labelControl5, labelControl8, labelControl9, textControl1, textControl2});

        form1.add(jPanel2);

        jTabbedPane1.addTab("Detalle", form1);

        gridControl6.setDefaultQuickFilterCriteria(org.openswing.swing.util.java.Consts.CONTAINS);
        gridControl6.setDeleteButton(deleteButton7);
        gridControl6.setEditButton(editButton7);
        gridControl6.setEditOnSingleRow(true);
        gridControl6.setFilterButton(filterButton6);
        gridControl6.setMaxNumberOfRowsOnInsert(4);
        gridControl6.setReloadButton(reloadButton8);
        gridControl6.setSaveButton(saveButton8);
        gridControl6.setValueObjectClassName(Pago.class.getName());

        decimalColumn6.setColumnName("id");
        decimalColumn6.setColumnRequired(false);
        decimalColumn6.setColumnVisible(false);
        decimalColumn6.setPreferredWidth(40);
        gridControl6.getColumnContainer().add(decimalColumn6);

        textColumn3.setColumnName("numeroFactura");
        textColumn3.setColumnRequired(false);
        gridControl6.getColumnContainer().add(textColumn3);

        textColumn6.setColumnName("numeroControl");
        textColumn6.setColumnRequired(false);
        gridControl6.getColumnContainer().add(textColumn6);

        dateColumn1.setColumnName("fechaFactura");
        dateColumn1.setColumnRequired(false);
        gridControl6.getColumnContainer().add(dateColumn1);

        dateColumn2.setColumnName("fechaRecepcion");
        dateColumn2.setColumnRequired(false);
        gridControl6.getColumnContainer().add(dateColumn2);

        checkBoxColumn1.setColumnName("auditoria.activo");
        checkBoxColumn1.setColumnRequired(false);
        gridControl6.getColumnContainer().add(checkBoxColumn1);

        textColumn10.setColumnName("auditoria.usuarioInsert");
        textColumn10.setColumnRequired(false);
        gridControl6.getColumnContainer().add(textColumn10);

        dateTimeColumn5.setColumnName("auditoria.fechaInsert");
        dateTimeColumn5.setColumnRequired(false);
        gridControl6.getColumnContainer().add(dateTimeColumn5);

        textColumn11.setColumnName("auditoria.usuarioInsert");
        textColumn11.setColumnRequired(false);
        gridControl6.getColumnContainer().add(textColumn11);

        dateTimeColumn6.setColumnName("auditoria.fechaInsertUpdate");
        dateTimeColumn6.setColumnRequired(false);
        gridControl6.getColumnContainer().add(dateTimeColumn6);

        jPanel16.setLayout(new java.awt.GridLayout(3, 2, 2, 2));

        insertButton8.setButtonId("asegurado");
        jPanel16.add(insertButton8);
        jPanel16.add(editButton7);
        jPanel16.add(deleteButton7);
        jPanel16.add(saveButton8);
        jPanel16.add(reloadButton8);
        jPanel16.add(filterButton6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl6, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
            .addComponent(gridControl6, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Pagos", jPanel7);

        jPanel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        gridControl4.setDeleteButton(deleteButton6);
        gridControl4.setEditButton(editButton6);
        gridControl4.setInsertButton(insertButton6);
        gridControl4.setMaxNumberOfRowsOnInsert(4);
        gridControl4.setReloadButton(reloadButton6);
        gridControl4.setSaveButton(saveButton6);
        gridControl4.setValueObjectClassName(Observacion.class.getName());
        gridControl4.setVisibleStatusPanel(false);

        decimalColumn4.setColumnName("id");
        decimalColumn4.setColumnRequired(false);
        decimalColumn4.setColumnVisible(false);
        decimalColumn4.setPreferredWidth(40);
        gridControl4.getColumnContainer().add(decimalColumn4);

        textColumn1.setColumnName("observacion");
        textColumn1.setEditableOnEdit(true);
        textColumn1.setEditableOnInsert(true);
        textColumn1.setMaxCharacters(1024);
        textColumn1.setPreferredWidth(400);
        gridControl4.getColumnContainer().add(textColumn1);

        textColumn8.setColumnName("auditoria.usuarioInsert");
        textColumn8.setColumnRequired(false);
        gridControl4.getColumnContainer().add(textColumn8);

        dateTimeColumn1.setColumnName("auditoria.fechaInsert");
        dateTimeColumn1.setColumnRequired(false);
        gridControl4.getColumnContainer().add(dateTimeColumn1);

        textColumn4.setColumnFilterable(true);
        textColumn4.setColumnName("auditoria.usuarioUpdate");
        textColumn4.setColumnRequired(false);
        textColumn4.setColumnSortable(true);
        gridControl4.getColumnContainer().add(textColumn4);

        dateTimeColumn2.setColumnFilterable(true);
        dateTimeColumn2.setColumnName("auditoria.fechaUpdate");
        dateTimeColumn2.setColumnRequired(false);
        dateTimeColumn2.setColumnSortable(true);
        gridControl4.getColumnContainer().add(dateTimeColumn2);

        jPanel13.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel13.add(insertButton6);
        jPanel13.add(editButton6);
        jPanel13.add(deleteButton6);
        jPanel13.add(saveButton6);
        jPanel13.add(reloadButton6);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl4, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
            .addComponent(gridControl4, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Observaciones", jPanel6);

        jPanel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        gridControl5.setInsertButton(insertButton7);
        gridControl5.setMaxNumberOfRowsOnInsert(4);
        gridControl5.setReloadButton(reloadButton7);
        gridControl5.setSaveButton(saveButton7);
        gridControl5.setValueObjectClassName(NotaTecnica.class.getName());
        gridControl5.setVisibleStatusPanel(false);

        decimalColumn5.setColumnName("id");
        decimalColumn5.setColumnRequired(false);
        decimalColumn5.setColumnVisible(false);
        decimalColumn5.setPreferredWidth(40);
        gridControl5.getColumnContainer().add(decimalColumn5);

        textColumn2.setColumnName("observacion");
        textColumn2.setEditableOnEdit(true);
        textColumn2.setEditableOnInsert(true);
        textColumn2.setMaxCharacters(1024);
        textColumn2.setPreferredWidth(400);
        gridControl5.getColumnContainer().add(textColumn2);

        textColumn9.setColumnName("auditoria.usuarioInsert");
        textColumn9.setColumnRequired(false);
        gridControl5.getColumnContainer().add(textColumn9);

        dateTimeColumn3.setColumnName("auditoria.fechaInsert");
        dateTimeColumn3.setColumnRequired(false);
        gridControl5.getColumnContainer().add(dateTimeColumn3);

        textColumn5.setColumnFilterable(true);
        textColumn5.setColumnName("auditoria.usuarioUpdate");
        textColumn5.setColumnRequired(false);
        textColumn5.setColumnSortable(true);
        gridControl5.getColumnContainer().add(textColumn5);

        dateTimeColumn4.setColumnFilterable(true);
        dateTimeColumn4.setColumnName("auditoria.fechaUpdate");
        dateTimeColumn4.setColumnRequired(false);
        dateTimeColumn4.setColumnSortable(true);
        gridControl5.getColumnContainer().add(dateTimeColumn4);

        jPanel15.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel15.add(insertButton7);
        jPanel15.add(saveButton7);
        jPanel15.add(reloadButton7);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl5, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
            .addComponent(gridControl5, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Notas Tecnicas", jPanel5);

        gridReportes.setValueObjectClassName(Reporte.class.getName());
        gridReportes.setVisibleStatusPanel(false);

        textColumn12.setColumnName("titulo");
        textColumn12.setEditableOnEdit(true);
        textColumn12.setEditableOnInsert(true);
        textColumn12.setMaxCharacters(1024);
        textColumn12.setPreferredWidth(400);
        gridReportes.getColumnContainer().add(textColumn12);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(gridReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(gridReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Reportes", jPanel4);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Documentos Anexos"));

        gridControl3.setDeleteButton(deleteButton5);
        gridControl3.setEditButton(editButton5);
        gridControl3.setFilterButton(filterButton5);
        gridControl3.setInsertButton(insertButton5);
        gridControl3.setMaxNumberOfRowsOnInsert(4);
        gridControl3.setReloadButton(reloadButton5);
        gridControl3.setSaveButton(saveButton5);
        gridControl3.setValueObjectClassName(Documento.class.getName());
        gridControl3.setVisibleStatusPanel(false);

        buttonColumn1.setColumnName("button");
        buttonColumn1.setEditableOnEdit(true);
        buttonColumn1.setEnableInReadOnlyMode(true);
        buttonColumn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        buttonColumn1.setPreferredWidth(20);
        buttonColumn1.setText("");
        gridControl3.getColumnContainer().add(buttonColumn1);

        integerColumn1.setColumnName("id");
        integerColumn1.setColumnRequired(false);
        integerColumn1.setPreferredWidth(40);
        gridControl3.getColumnContainer().add(integerColumn1);

        codLookupColumn2.setColumnName("tipoDocumento.nombre");
        codLookupColumn2.setControllerMethodName("getTipoDocAnex");
        codLookupColumn2.setEditableOnEdit(true);
        codLookupColumn2.setEditableOnInsert(true);
        gridControl3.getColumnContainer().add(codLookupColumn2);

        textColumn7.setColumnName("observacion");
        textColumn7.setColumnRequired(false);
        textColumn7.setEditableOnEdit(true);
        textColumn7.setEditableOnInsert(true);
        gridControl3.getColumnContainer().add(textColumn7);

        dateColumn3.setColumnName("fechaVencimiento");
        dateColumn3.setColumnRequired(false);
        dateColumn3.setEditableOnEdit(true);
        dateColumn3.setEditableOnInsert(true);
        gridControl3.getColumnContainer().add(dateColumn3);

        jPanel11.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        jPanel11.add(insertButton5);
        jPanel11.add(editButton5);
        jPanel11.add(deleteButton5);
        jPanel11.add(saveButton5);
        jPanel11.add(reloadButton5);
        jPanel11.add(filterButton5);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridControl3, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gridControl3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Documentos Anexos", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public BeanVO getBeanVO() {
        return (BeanVO) form1.getVOModel().getValueObject();
    }

    @Override
    public void inicializar(FormController formController, boolean addToMDIFrame) {
        initComponents();

        org.openswing.swing.table.columns.client.PictureCaptureColumn pcc = new org.openswing.swing.table.columns.client.PictureCaptureColumn();
        pcc.setColumnName("file");
        pcc.setEditableOnInsert(true);
        pcc.setEditableOnEdit(false);
        pcc.setFileNameAttributeName("fileName");
        pcc.setPreferredWidth(220);
        gridControl3.getColumnContainer().add(pcc);
        controllerDocumentosAnexosX = new DefaultDocumentosAnexosGridController(DetalleSiniestro.class, gridControl3);
        buttonColumn1.addActionListener(controllerDocumentosAnexosX);
        gridControl3.setController(controllerDocumentosAnexosX);
        gridControl3.setGridDataLocator(controllerDocumentosAnexosX);

        com.jswitch.base.controlador.documentosAnexos.TipoDocumentoLookupController lookupDocumentoAnexo2 =
                new TipoDocumentoLookupController(com.jswitch.base.modelo.Dominios.Modulos.PERSONAS);
        lookupDocumentoAnexo2.addLookup2ParentLink("tipoDocumento");
        codLookupColumn2.setLookupController(lookupDocumentoAnexo2);

        controllerObservaciones =
                new DefaultGridInternalController(DetalleSiniestro.class.getName(), "getObservaciones", gridControl4);
        gridControl4.setGridDataLocator(controllerObservaciones);
        gridControl4.setController(controllerObservaciones);

        controllerNotasTecnicas =
                new DefaultGridInternalController(DetalleSiniestro.class.getName(), "getNotasTecnicas", gridControl5);
        gridControl5.setGridDataLocator(controllerNotasTecnicas);
        gridControl5.setController(controllerNotasTecnicas);

        controllerPagos = new DefaultGridInternalController(DetalleSiniestro.class.getName(), "getPagos", gridControl6);
        gridControl6.setGridDataLocator(controllerPagos);
        gridControl6.setController(controllerPagos);

        controllerReportes =
                new ReporteGridInternalController(Reembolso.class.getName(), "getReportes", gridReportes);
        gridReportes.setGridDataLocator(controllerReportes);
        gridReportes.setController(controllerReportes);

        lookupPersonaPago.addLookup2ParentLink("personaPago");
        codLookupControl1.setLookupController(lookupPersonaPago);
        codLookupControl1.setOpenDetail("personaPago",
                PersonasDetailController.class.getName(),
                new Class[]{GridControl.class, BeanVO.class, Rif.class}, new Object[]{null, null, null}, 1);
        PersonaLookupControllerPorNombre p = new PersonaLookupControllerPorNombre("NEG");
        p.addLookup2ParentLink("analistaNegociador");
        codLookupControl2.setLookupController(p);
        codLookupControl2.setOpenDetail("analistaNegociador",
                PersonasDetailController.class.getName(),
                new Class[]{GridControl.class, BeanVO.class, Rif.class}, new Object[]{null, null, null}, 1);
        SiniestroLookupController controller = new SiniestroLookupController(TipoSiniestro.class.getName(), Reembolso.class.getName());
        controller.addLookup2ParentLink("tipoSiniestro");
        codLookupControl3.setLookupController(controller);
        SiniestroLookupController e = new SiniestroLookupController(EtapaSiniestro.class.getName(), Reembolso.class.getName());
        e.addLookup2ParentLink("etapaSiniestro");
        codLookupControl4.setLookupController(e);
        insertButton8.addActionListener((ReembolsoDetailFrameController) formController);
        form1.setCreateInnerVO(false);
        form1.setFormController(formController);

        if (addToMDIFrame) {
            pack();
        } else {
            setBounds(0, 0, 0, 0);
        }
        MDIFrame.add(this);
    }

    @Override
    public void setOwnerVO(BeanVO beanVO) {
        Long id = null;
        if (beanVO != null) {
            id = ((DetalleSiniestro) beanVO).getId();
        }
        controllerDocumentosAnexosX.setBeanVO(beanVO, id);
        controllerObservaciones.setBeanVO(beanVO);
        controllerNotasTecnicas.setBeanVO(beanVO);
        controllerReportes.setBeanVO(beanVO);
        controllerPagos.setBeanVO(beanVO);
        reloadGridsData();
    }

    @Override
    public Form getMainPanel() {
        return form1;
    }

    @Override
    public void reloadGridsData() {
        gridControl3.reloadData();
        gridControl4.reloadData();
        gridControl5.reloadData();
        gridControl6.reloadData();
    }

    @Override
    public void clearGridsData() {
        gridControl3.clearData();
        gridControl4.clearData();
        gridControl5.clearData();
        gridControl6.clearData();
    }

    @Override
    public void saveGridsData() {
        gridControl3.getSaveButton().doClick();
        gridControl4.getSaveButton().doClick();
        gridControl5.getSaveButton().doClick();
        gridControl6.getSaveButton().doClick();

    }

    @Override
    public void modeChanged(int currentMode) {
        if (currentMode == Consts.INSERT) {
            clearGridsData();
        }
        if (currentMode == Consts.INSERT) {
            setEnableGridInternalButtons(false);
        } else {
            setEnableGridInternalButtons(true);
        }
    }

    private void setEnableGridInternalButtons(boolean enabled) {
        jPanel11.setVisible(enabled);
        jPanel13.setVisible(enabled);
        jPanel15.setVisible(enabled);
        jPanel16.setVisible(enabled);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.ButtonColumn buttonColumn1;
    private org.openswing.swing.table.columns.client.CheckBoxColumn checkBoxColumn1;
    private org.openswing.swing.client.CheckBoxControl checkBoxControl1;
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumn2;
    private org.openswing.swing.client.CodLookupControl codLookupControl1;
    private org.openswing.swing.client.CodLookupControl codLookupControl2;
    private org.openswing.swing.client.CodLookupControl codLookupControl3;
    private org.openswing.swing.client.CodLookupControl codLookupControl4;
    private org.openswing.swing.client.ComboBoxControl comboBoxControl1;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn1;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn2;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn3;
    private org.openswing.swing.client.DateControl dateControl1;
    private org.openswing.swing.client.DateControl dateControl2;
    private org.openswing.swing.client.DateControl dateControl3;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn1;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn2;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn3;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn4;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn5;
    private org.openswing.swing.table.columns.client.DateTimeColumn dateTimeColumn6;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn4;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn5;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn6;
    private org.openswing.swing.client.DeleteButton deleteButton5;
    private org.openswing.swing.client.DeleteButton deleteButton6;
    private org.openswing.swing.client.DeleteButton deleteButton7;
    private org.openswing.swing.client.EditButton editButton1;
    private org.openswing.swing.client.EditButton editButton5;
    private org.openswing.swing.client.EditButton editButton6;
    private org.openswing.swing.client.EditButton editButton7;
    private org.openswing.swing.client.FilterButton filterButton5;
    private org.openswing.swing.client.FilterButton filterButton6;
    private org.openswing.swing.form.client.Form form1;
    private org.openswing.swing.client.GridControl gridControl3;
    private org.openswing.swing.client.GridControl gridControl4;
    private org.openswing.swing.client.GridControl gridControl5;
    private org.openswing.swing.client.GridControl gridControl6;
    private org.openswing.swing.client.GridControl gridReportes;
    private org.openswing.swing.client.InsertButton insertButton5;
    private org.openswing.swing.client.InsertButton insertButton6;
    private org.openswing.swing.client.InsertButton insertButton7;
    private org.openswing.swing.client.InsertButton insertButton8;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.openswing.swing.client.LabelControl labelControl1;
    private org.openswing.swing.client.LabelControl labelControl10;
    private org.openswing.swing.client.LabelControl labelControl11;
    private org.openswing.swing.client.LabelControl labelControl12;
    private org.openswing.swing.client.LabelControl labelControl2;
    private org.openswing.swing.client.LabelControl labelControl3;
    private org.openswing.swing.client.LabelControl labelControl4;
    private org.openswing.swing.client.LabelControl labelControl5;
    private org.openswing.swing.client.LabelControl labelControl8;
    private org.openswing.swing.client.LabelControl labelControl9;
    private org.openswing.swing.client.ReloadButton reloadButton5;
    private org.openswing.swing.client.ReloadButton reloadButton6;
    private org.openswing.swing.client.ReloadButton reloadButton7;
    private org.openswing.swing.client.ReloadButton reloadButton8;
    private org.openswing.swing.client.SaveButton saveButton1;
    private org.openswing.swing.client.SaveButton saveButton5;
    private org.openswing.swing.client.SaveButton saveButton6;
    private org.openswing.swing.client.SaveButton saveButton7;
    private org.openswing.swing.client.SaveButton saveButton8;
    private org.openswing.swing.table.columns.client.TextColumn textColumn1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn10;
    private org.openswing.swing.table.columns.client.TextColumn textColumn11;
    private org.openswing.swing.table.columns.client.TextColumn textColumn12;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn3;
    private org.openswing.swing.table.columns.client.TextColumn textColumn4;
    private org.openswing.swing.table.columns.client.TextColumn textColumn5;
    private org.openswing.swing.table.columns.client.TextColumn textColumn6;
    private org.openswing.swing.table.columns.client.TextColumn textColumn7;
    private org.openswing.swing.table.columns.client.TextColumn textColumn8;
    private org.openswing.swing.table.columns.client.TextColumn textColumn9;
    private org.openswing.swing.client.TextControl textControl1;
    private org.openswing.swing.client.TextControl textControl2;
    // End of variables declaration//GEN-END:variables

    public PersonaTipoLookupController getLookupPersonaPago() {
        return lookupPersonaPago;
    }
}
