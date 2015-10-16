DESCRIPTION = "DisplayPress Environmental Variables"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://gpl-2.0.txt;md5=3237578781557788595c6a1e834d126a"

DEPENDS = "bzip2"

SRC_URI += "file://qt5.sh \
	file://gpl-2.0.txt"

PR = "39"
PV = "14130"
S = "${WORKDIR}"

FILES_${PN} += "/etc/profile.d/qt5.sh"

do_install() {
	install -d ${D}/etc/profile.d

	cp qt5.sh ${D}/etc/profile.d/
}
