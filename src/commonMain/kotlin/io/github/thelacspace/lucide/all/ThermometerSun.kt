package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ThermometerSun") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                curveTo(10.11428451538086,7.999048709869385,8.484017372131348,9.315232276916504,8.08743953704834,11.158775329589844)
                curveTo(7.69086217880249,13.002317428588867,8.635698318481445,14.87244987487793,10.354999542236328,15.64699935913086)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,14.539999961853027)
                curveTo(21.567873001098633,15.445211410522461,22.332275390625,17.2906436920166,21.86370277404785,19.039377212524414)
                curveTo(21.395132064819336,20.78811264038086,19.810422897338867,22.004100799560547,18.0,22.004100799560547)
                curveTo(16.189577102661133,22.004100799560547,14.60486888885498,20.78811264038086,14.136296272277832,19.039377212524414)
                curveTo(13.667724609375,17.2906436920166,14.432127952575684,15.445211410522461,16.0,14.539999961853027)
                lineTo(16.0,4.0)
                curveTo(16.004924774169922,2.8989217281341553,16.898910522460938,2.0089242458343506,18.0,2.0089242458343506)
                curveTo(19.101089477539062,2.0089242458343506,19.995075225830078,2.8989217281341553,20.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.929999828338623,4.929999828338623)
                lineTo(6.339999675750732,6.339999675750732)
            }
            lucidePath(strokeWidth) {
                moveTo(6.340000152587891,17.65999984741211)
                lineTo(4.930000305175781,19.06999969482422)
            }
}

public val LucideIcons.All.ThermometerSunDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ThermometerSun: ImageVector
    @Composable get() = ThermometerSunDefinition.asImageVector()
