package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScanBox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,17.5)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,17.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(17.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                lineTo(7.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.263999938964844,9.251999855041504)
                lineTo(12.0,12.0)
                lineTo(16.73699951171875,9.251999855041504)
            }
            lucidePath(strokeWidth) {
                moveTo(7.994999885559082,8.513999938964844)
                curveTo(7.378755569458008,8.872166633605957,6.999698638916016,9.531230926513672,7.0,10.244000434875488)
                lineTo(7.0,13.760000228881836)
                curveTo(6.999905586242676,14.47297477722168,7.379371166229248,15.132086753845215,7.995999813079834,15.489999771118164)
                lineTo(10.996000289916992,17.229999542236328)
                curveTo(11.61683177947998,17.59035301208496,12.38316822052002,17.59035301208496,13.003999710083008,17.229999542236328)
                lineTo(16.003999710083008,15.489999771118164)
                curveTo(16.620628356933594,15.132086753845215,17.000093460083008,14.47297477722168,17.0,13.760000228881836)
                lineTo(17.0,10.243000030517578)
                curveTo(17.000301361083984,9.530230522155762,16.62124252319336,8.871166229248047,16.0049991607666,8.51300048828125)
                lineTo(13.004999160766602,6.771000385284424)
                curveTo(12.424996376037598,6.433644771575928,11.714472770690918,6.409610271453857,11.112998962402344,6.707000255584717)
                close()
            }
}

public val LucideIcons.All.ScanBoxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScanBox: ImageVector
    @Composable get() = ScanBoxDefinition.asImageVector()
