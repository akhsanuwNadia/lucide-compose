package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WebcamOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.753999710083008,7.0960001945495605)
                curveTo(13.807663917541504,7.36951208114624,14.630487442016602,8.192336082458496,14.903999328613281,9.246000289916992)
            }
            lucidePath(strokeWidth) {
                moveTo(12.86299991607666,12.873000144958496)
                curveTo(11.805948257446289,13.19025707244873,10.660059928894043,12.901515007019043,9.87956714630127,12.121231079101562)
                curveTo(9.099075317382812,11.340948104858398,8.810026168823242,10.195137023925781,9.126999855041504,9.13800048828125)
            }
            lucidePath(strokeWidth) {
                moveTo(16.56599998474121,16.56999969482422)
                curveTo(13.386353492736816,18.783470153808594,9.077595710754395,18.40046501159668,6.338229179382324,15.660852432250977)
                curveTo(3.598862648010254,12.921239852905273,3.2162435054779053,8.612447738647461,5.429999828338623,5.433000087738037)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,22.0)
                lineTo(17.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.477999687194824,2.816999912261963)
                curveTo(11.549249649047852,1.3110942840576172,15.238137245178223,1.9244388341903687,17.656848907470703,4.3431501388549805)
                curveTo(20.075559616088867,6.761861801147461,20.68890380859375,10.450749397277832,19.182998657226562,13.52199935913086)
            }
}

public val LucideIcons.All.WebcamOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WebcamOff: ImageVector
    @Composable get() = WebcamOffDefinition.asImageVector()
