package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tangent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,4.0f)
                curveTo(14.996795f,4.716662f,15.377291f,5.3802605f,15.997409f,5.7395196f)
                curveTo(16.617527f,6.098779f,17.382473f,6.098779f,18.00259f,5.7395196f)
                curveTo(18.62271f,5.3802605f,19.003204f,4.716662f,19.0f,4.0f)
                curveTo(19.003204f,3.283338f,18.62271f,2.6197395f,18.00259f,2.2604802f)
                curveTo(17.382473f,1.9012209f,16.617527f,1.9012209f,15.997409f,2.2604802f)
                curveTo(15.377291f,2.6197395f,14.996795f,3.283338f,15.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.59f,5.41f)
                lineTo(5.41f,15.59f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,17.0f)
                curveTo(1.9967949f,17.716661f,2.3772902f,18.38026f,2.997409f,18.73952f)
                curveTo(3.617528f,19.09878f,4.382472f,19.09878f,5.0025907f,18.73952f)
                curveTo(5.6227098f,18.38026f,6.003205f,17.716661f,6.0f,17.0f)
                curveTo(6.003205f,16.283339f,5.6227098f,15.61974f,5.0025907f,15.26048f)
                curveTo(4.382472f,14.901221f,3.617528f,14.901221f,2.997409f,15.26048f)
                curveTo(2.3772902f,15.61974f,1.9967949f,16.283339f,2.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                curveTo(12.0f,22.0f,8.0f,13.0f,10.5f,10.5f)
                curveTo(13.0f,8.0f,22.0f,12.0f,22.0f,12.0f)
            }
}

public val LucideIcons.All.TangentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tangent: ImageVector
    @Composable get() = TangentDefinition.asImageVector()
