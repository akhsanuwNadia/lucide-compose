package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ThermometerSnowflake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,20.0)
                lineTo(8.75,17.5)
                lineTo(6.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,4.0)
                lineTo(8.75,6.5)
                lineTo(6.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.585000038146973,15.0)
                lineTo(10.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(8.5,12.0)
                lineTo(10.0,9.0)
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
                moveTo(4.0,10.0)
                lineTo(5.5,12.0)
                lineTo(4.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(10.0,15.0)
                lineTo(8.5,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,3.0)
                lineTo(10.0,9.0)
                lineTo(12.0,9.0)
            }
}

public val LucideIcons.All.ThermometerSnowflakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ThermometerSnowflake: ImageVector
    @Composable get() = ThermometerSnowflakeDefinition.asImageVector()
