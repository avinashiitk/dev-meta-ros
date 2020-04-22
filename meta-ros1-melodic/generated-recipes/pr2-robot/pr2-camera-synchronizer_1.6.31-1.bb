# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "<p>     The PR2 is equipped with a texture projector that can be used to     project a texture onto featureless surfaces, allowing their     three-dimensional structure to be determined using stereoscopy. The     projector operates in a pulsed mode, producing brief (2ms) pulses of     light. Cameras that want to see the texture must expose during the     projector pulse; other cameras should be expose while the projector is     off.     </p>      <p>       This package contains the pr2_projector_synchronizer node. Based on its dynamically reconfigurable parameters, this node controls the projector pulsing, and sets up triggering of the WGE100 cameras.     </p>"
AUTHOR = "Dave Feil-Seifer <dave@cse.unr.edu>"
ROS_AUTHOR = "Blaise Gassend"
HOMEPAGE = "http://pr.willowgarage.com/wiki/pr2_camera_synchronizer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_robot"
ROS_BPN = "pr2_camera_synchronizer"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    dynamic-reconfigure \
    ethercat-trigger-controllers \
    rospy \
    wge100-camera \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    dynamic-reconfigure \
    ethercat-trigger-controllers \
    rospy \
    wge100-camera \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/pr2_robot-release/archive/release/melodic/pr2_camera_synchronizer/1.6.31-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pr2_camera_synchronizer"
SRC_URI = "git://github.com/pr2-gbp/pr2_robot-release;${ROS_BRANCH};protocol=https"
SRCREV = "aa6284ea44ab3854d4faaf73ae89cadf96032764"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
