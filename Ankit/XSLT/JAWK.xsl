<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
        <center>
          <h1>JAWK Assignment</h1>
        </center>
        <h3>List of Doctor Table</h3>
        <table border="1">
          <tr bgcolor="#9acd32">
            <th style="text-align:left">ID</th>
            <th style="text-align:left">Name</th>
            <th style="text-align:left">Surname</th>
            <th style="text-align:left">Address</th>
            <th style="text-align:left">Phone Number</th>
            <th style="text-align:left">DOB</th>
            <th style="text-align:left">Specialization</th>
          </tr>
          <xsl:for-each select="DOCTOR_PATIENT/DoctorDetails/doctor">
            <tr>
              <td>
                <xsl:value-of select="ID"/>
              </td>
              <td>
                <xsl:value-of select="Name"/>
              </td>
              <td>
                <xsl:value-of select="surname"/>
              </td>
              <td>
                <xsl:value-of select="address"/>
              </td>
              <td>
                <xsl:value-of select="phonenumber"/>
              </td>
              <td>
                <xsl:value-of select="DOB"/>
              </td>
              <td>
                <xsl:value-of select="specialization"/>
              </td>
            </tr>
          </xsl:for-each>
        </table>

        <h3>Table of Doctors Showing Number Of Appointments</h3>
        <table border="1">
          <tr bgcolor="#9acd32">
            <th style="text-align:left">Name</th>
            <th style="text-align:left">Surname</th>
            <th style="text-align:left">Address</th>
            <th style="text-align:left">Phone Number</th>
            <th style="text-align:left">DOB</th>
            <th style="text-align:left">Specialization</th>
            <th style="text-align:left">Appointmentday</th>
          </tr>
          <xsl:for-each select="DOCTOR_PATIENT/DoctorDetails/doctor">
            <tr>
              <td>
                <xsl:value-of select="Name"/>
              </td>
              <td>
                <xsl:value-of select="surname"/>
              </td>
              <td>
                <xsl:value-of select="address"/>
              </td>
              <td>
                <xsl:value-of select="phonenumber"/>
              </td>
              <td>
                <xsl:value-of select="DOB"/>
              </td>
              <td>
                <xsl:value-of select="specialization"/>
              </td>
              <td>
                <xsl:value-of select="appointmentday"/>
              </td>
            </tr>
          </xsl:for-each>
        </table>
        <h3>Table of Doctors Showing Appointment number</h3>
        <table border="1">
          <tr bgcolor="#9acd32">
            <th style="text-align:left">Name</th>
            <th style="text-align:left">Surname</th>
            <th style="text-align:left">Phone Number</th>
            <th style="text-align:left">Specialization</th>
            <th style="text-align:left">Appointment Number</th>
          </tr>
          <xsl:for-each select="DOCTOR_PATIENT/DoctorDetails/doctor">
            <tr>
              <td>
                <xsl:value-of select="Name"/>
              </td>
              <td>
                <xsl:value-of select="surname"/>
              </td>
              <td>
                <xsl:value-of select="phonenumber"/>
              </td>
              <td>
                <xsl:value-of select="specialization"/>
              </td>
              <td>
                <xsl:value-of select="apnum"/>
              </td>
            </tr>
          </xsl:for-each>
        </table>
        <h3>Table of Patient</h3>
        <table border="1">
          <tr bgcolor="#9acd32">
            <th style="text-align:left">ID</th>
            <th style="text-align:left">Name</th>
            <th style="text-align:left">Surname</th>
            <th style="text-align:left">Address</th>
            <th style="text-align:left">Phone Number</th>
            <th style="text-align:left">DOB</th>
            <th style="text-align:left">Appointment Number</th>
            <th style="text-align:left">Ill Details</th>
          </tr>
          <xsl:for-each select="DOCTOR_PATIENT/PatientDetails/Patient">
            <tr>
              <td>
                <xsl:value-of select="ID"/>
              </td>
              <td>
                <xsl:value-of select="Name"/>
              </td>
              <td>
                <xsl:value-of select="surname"/>
              </td>
              <td>
                <xsl:value-of select="address"/>
              </td>
              <td>
                <xsl:value-of select="phonenumber"/>
              </td>
              <td>
                <xsl:value-of select="DOB"/>
              </td>
              <td>
                <xsl:value-of select="appointmentnumber"/>
              </td>
              <td>
                <xsl:value-of select="illnessDetails"/>
              </td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
