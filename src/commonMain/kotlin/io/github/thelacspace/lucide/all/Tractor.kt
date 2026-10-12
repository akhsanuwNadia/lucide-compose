package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tractor") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,11.0f)
                lineTo(21.0f,11.9f)
                curveTo(21.513363f,12.000934f,21.862146f,12.480514f,21.8f,13.0f)
                lineTo(21.134998f,17.158f)
                curveTo(21.05734f,17.643332f,20.638502f,18.000277f,20.146997f,18.0f)
                lineTo(20.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,18.0f)
                lineTo(11.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,5.0f)
                curveTo(17.447716f,5.0f,17.0f,5.4477153f,17.0f,6.0f)
                lineTo(17.0f,11.573f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,4.0f)
                lineTo(11.129f,4.0f)
                curveTo(11.628129f,4.000285f,12.050619f,4.3685765f,12.1189995f,4.863f)
                lineTo(13.0f,11.246f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,11.0f)
                lineTo(4.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,15.0f)
                lineTo(7.01f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,10.1f)
                lineTo(8.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,18.0f)
                curveTo(15.996795f,18.716661f,16.37729f,19.38026f,16.99741f,19.73952f)
                curveTo(17.617527f,20.09878f,18.382473f,20.09878f,19.00259f,19.73952f)
                curveTo(19.62271f,19.38026f,20.003204f,18.716661f,20.0f,18.0f)
                curveTo(20.003204f,17.283339f,19.62271f,16.61974f,19.00259f,16.26048f)
                curveTo(18.382473f,15.901221f,17.617527f,15.901221f,16.99741f,16.26048f)
                curveTo(16.37729f,16.61974f,15.996795f,17.283339f,16.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,15.0f)
                curveTo(1.9919875f,16.791655f,2.9432259f,18.450651f,4.4935226f,19.348799f)
                curveTo(6.04382f,20.246948f,7.95618f,20.246948f,9.506477f,19.348799f)
                curveTo(11.056774f,18.450651f,12.008013f,16.791655f,12.0f,15.0f)
                curveTo(12.008013f,13.208345f,11.056774f,11.549349f,9.506477f,10.6512f)
                curveTo(7.95618f,9.753052f,6.04382f,9.753052f,4.4935226f,10.6512f)
                curveTo(2.9432259f,11.549349f,1.9919875f,13.208345f,2.0f,15.0f)
            }
}

public val LucideIcons.All.TractorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tractor: ImageVector
    @Composable get() = TractorDefinition.asImageVector()
