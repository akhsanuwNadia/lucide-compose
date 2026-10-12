package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Thermometer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,4.0)
                lineTo(14.0,14.539999961853027)
                curveTo(15.567872047424316,15.445211410522461,16.332275390625,17.2906436920166,15.863703727722168,19.039377212524414)
                curveTo(15.39513111114502,20.78811264038086,13.810422897338867,22.004100799560547,12.0,22.004100799560547)
                curveTo(10.189577102661133,22.004100799560547,8.60486888885498,20.78811264038086,8.136296272277832,19.039377212524414)
                curveTo(7.667724609375,17.2906436920166,8.432127952575684,15.445211410522461,10.0,14.539999961853027)
                lineTo(10.0,4.0)
                curveTo(10.004923820495605,2.8989217281341553,10.898910522460938,2.0089242458343506,12.0,2.0089242458343506)
                curveTo(13.101089477539062,2.0089242458343506,13.995076179504395,2.8989217281341553,14.0,4.0)
                close()
            }
}

public val LucideIcons.All.ThermometerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Thermometer: ImageVector
    @Composable get() = ThermometerDefinition.asImageVector()
