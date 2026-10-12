package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PenTool") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,13.0f)
                lineTo(17.346f,8.264f)
                curveTo(17.134584f,6.7347026f,16.061962f,5.4635906f,14.59f,4.998f)
                lineTo(5.427f,2.098f)
                curveTo(4.7153454f,1.8731186f,3.937682f,2.063197f,3.41f,2.591f)
                lineTo(2.5900002f,3.41f)
                curveTo(2.062551f,3.9378948f,1.8728652f,4.71553f,2.098f,5.427f)
                lineTo(4.998f,14.59f)
                curveTo(5.4635906f,16.061962f,6.7347026f,17.134584f,8.264f,17.346f)
                lineTo(13.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.648f,12.352f)
                curveTo(19.118568f,11.881503f,19.881433f,11.881503f,20.352001f,12.352f)
                lineTo(21.648f,13.648001f)
                curveTo(22.118498f,14.118568f,22.118498f,14.8814335f,21.648f,15.352001f)
                lineTo(15.352001f,21.648f)
                curveTo(14.8814335f,22.118498f,14.118568f,22.118498f,13.648001f,21.648f)
                lineTo(12.352001f,20.352001f)
                curveTo(11.881504f,19.881433f,11.881504f,19.118568f,12.352001f,18.648f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(9.586f,9.586f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,11.0f)
                curveTo(8.996795f,11.716661f,9.377291f,12.38026f,9.997409f,12.73952f)
                curveTo(10.617528f,13.098779f,11.382472f,13.098779f,12.002591f,12.73952f)
                curveTo(12.622709f,12.38026f,13.003205f,11.716661f,13.0f,11.0f)
                curveTo(13.003205f,10.283339f,12.622709f,9.61974f,12.002591f,9.26048f)
                curveTo(11.382472f,8.901221f,10.617528f,8.901221f,9.997409f,9.26048f)
                curveTo(9.377291f,9.61974f,8.996795f,10.283339f,9.0f,11.0f)
            }
}

public val LucideIcons.All.PenToolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PenTool: ImageVector
    @Composable get() = PenToolDefinition.asImageVector()
