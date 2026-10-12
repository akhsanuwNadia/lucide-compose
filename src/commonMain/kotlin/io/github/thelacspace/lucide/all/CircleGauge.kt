package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleGauge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.6f,2.7f)
                curveTo(11.191833f,0.98744303f,6.1866703f,2.5970054f,3.6030054f,6.557999f)
                curveTo(1.0193405f,10.518992f,1.5636393f,15.748341f,4.907648f,19.09235f)
                curveTo(8.2516575f,22.43636f,13.481005f,22.980658f,17.442f,20.396994f)
                curveTo(21.402992f,17.81333f,23.012556f,12.808167f,21.3f,8.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                curveTo(9.996795f,12.716661f,10.377291f,13.38026f,10.997409f,13.73952f)
                curveTo(11.617528f,14.098779f,12.382472f,14.098779f,13.002591f,13.73952f)
                curveTo(13.622709f,13.38026f,14.003205f,12.716661f,14.0f,12.0f)
                curveTo(14.003205f,11.283339f,13.622709f,10.61974f,13.002591f,10.26048f)
                curveTo(12.382472f,9.901221f,11.617528f,9.901221f,10.997409f,10.26048f)
                curveTo(10.377291f,10.61974f,9.996795f,11.283339f,10.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.4f,10.6f)
                lineTo(19.0f,5.0f)
            }
}

public val LucideIcons.All.CircleGaugeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleGauge: ImageVector
    @Composable get() = CircleGaugeDefinition.asImageVector()
