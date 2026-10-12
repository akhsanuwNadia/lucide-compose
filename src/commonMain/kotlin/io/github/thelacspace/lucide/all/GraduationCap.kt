package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GraduationCap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.420000076293945,10.92199993133545)
                curveTo(21.78591537475586,10.760575294494629,22.02046012878418,10.396656036376953,22.016324996948242,9.996737480163574)
                curveTo(22.012191772460938,9.596818923950195,21.77017593383789,9.237825393676758,21.4010009765625,9.083999633789062)
                lineTo(12.829999923706055,5.179999828338623)
                curveTo(12.302794456481934,4.939523696899414,11.697205543518066,4.939523696899414,11.170000076293945,5.179999828338623)
                lineTo(2.5999999046325684,9.079999923706055)
                curveTo(2.236205577850342,9.239330291748047,2.001178503036499,9.598844528198242,2.001178503036499,9.996000289916992)
                curveTo(2.001178503036499,10.393155097961426,2.236205577850342,10.752669334411621,2.5999999046325684,10.911999702453613)
                lineTo(11.170000076293945,14.819999694824219)
                curveTo(11.697205543518066,15.060476303100586,12.302794456481934,15.060476303100586,12.829999923706055,14.819999694824219)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,10.0)
                lineTo(22.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.5)
                lineTo(6.0,16.0)
                curveTo(6.014772415161133,17.6516170501709,8.696732521057129,18.986614227294922,12.0,18.986614227294922)
                curveTo(15.303267478942871,18.986614227294922,17.985227584838867,17.6516170501709,18.0,16.0)
                lineTo(18.0,12.5)
            }
}

public val LucideIcons.All.GraduationCapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GraduationCap: ImageVector
    @Composable get() = GraduationCapDefinition.asImageVector()
