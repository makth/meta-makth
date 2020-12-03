# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://LICENSE;md5=021f0823ab7b758b76eae99298a3cd4d"

SRC_URI = "git://github.com/cc65/cc65.git;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}"
# SRCREV = "31daa706b7290d97b4537feb5a4da87537684c25"

S = "${WORKDIR}/git"

EXTRA_OEMAKE ?= ""

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake clean
	echo "Test:${TARGET_PREFIX}"
	echo "Test:${CC}"
	oe_runmake bin
	oe_runmake lib
	oe_runmake clean -C src
	oe_runmake bin "CC=${CC}"
}

do_install () {
	# NOTE: unable to determine what to put here - there is a Makefile but no
	# target named "install", so you will need to define this yourself
	oe_runmake install "PREFIX=${D}${prefix}" -C src
	oe_runmake install "PREFIX=${D}${prefix}" -C libsrc
}

