package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BroomSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,2.0)
                lineTo(11.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(10.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5,10.5)
                lineTo(22.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.734000205993652,13.840999603271484)
                curveTo(15.19059944152832,13.056537628173828,15.061680793762207,12.062956809997559,14.420000076293945,11.420999526977539)
                lineTo(12.579999923706055,9.579999923706055)
                curveTo(11.937880516052246,8.937823295593262,10.943696975708008,8.808879852294922,10.159000396728516,9.265999794006348)
                lineTo(2.502000331878662,13.726999282836914)
                curveTo(2.233555793762207,13.8833589553833,2.0530269145965576,14.155600547790527,2.0134575366973877,14.463732719421387)
                curveTo(1.9738880395889282,14.771864891052246,2.079772710800171,15.080885887145996,2.299999952316284,15.300000190734863)
                lineTo(8.70300006866455,21.702999114990234)
                curveTo(8.922384262084961,21.922252655029297,9.231088638305664,22.027297973632812,9.538670539855957,21.98735809326172)
                curveTo(9.84625244140625,21.947416305541992,10.117889404296875,21.767011642456055,10.27400016784668,21.498998641967773)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,15.0)
                lineTo(20.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                lineTo(18.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(4.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,18.0)
                lineTo(7.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,6.0)
                lineTo(2.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.698999881744385,10.699999809265137)
                lineTo(13.301000595092773,16.30099868774414)
            }
}

public val LucideIcons.All.BroomSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BroomSparkles: ImageVector
    @Composable get() = BroomSparklesDefinition.asImageVector()
