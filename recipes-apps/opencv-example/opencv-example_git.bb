# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "opencv hdf5 glew fmt"
SRC_URI = "git://github.com/kraj/opencv-example;protocol=https;branch=main"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "7c2e7b3ab5cb41039c241c8ff07f16e6152f2e3e"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: OpenCV fmt
inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

