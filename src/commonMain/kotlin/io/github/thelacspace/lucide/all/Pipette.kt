package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pipette") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,9.0f)
                lineTo(3.5860004f,17.414f)
                curveTo(3.2109017f,17.788984f,3.0001135f,18.29761f,3.0f,18.828f)
                lineTo(3.0f,20.171999f)
                curveTo(2.9998865f,20.702389f,2.7890987f,21.211014f,2.414f,21.585999f)
                curveTo(2.7889857f,21.210901f,3.2976105f,21.000113f,3.828f,21.0f)
                lineTo(5.172f,21.0f)
                curveTo(5.7023897f,20.999887f,6.2110147f,20.789099f,6.586f,20.414f)
                lineTo(15.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,9.0f)
                lineTo(18.4f,9.4f)
                curveTo(18.9399f,9.935092f,19.152227f,10.718163f,18.956583f,11.452696f)
                curveTo(18.760939f,12.18723f,18.18723f,12.760938f,17.452696f,12.956583f)
                curveTo(16.718163f,13.152227f,15.935092f,12.939899f,15.4f,12.4f)
                lineTo(11.599999f,8.599999f)
                curveTo(11.0601f,8.064907f,10.847772f,7.2818365f,11.043416f,6.5473027f)
                curveTo(11.239061f,5.812769f,11.812769f,5.239061f,12.547303f,5.0434165f)
                curveTo(13.2818365f,4.8477716f,14.064907f,5.060099f,14.599999f,5.5999994f)
                lineTo(14.999999f,5.9999995f)
                lineTo(18.4f,2.5999994f)
                curveTo(18.935093f,2.0600991f,19.718163f,1.8477719f,20.452696f,2.0434165f)
                curveTo(21.18723f,2.2390609f,21.760939f,2.8127692f,21.956583f,3.5473027f)
                curveTo(22.152227f,4.2818365f,21.9399f,5.0649066f,21.4f,5.5999994f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                lineTo(2.414f,21.586f)
            }
}

public val LucideIcons.All.PipetteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pipette: ImageVector
    @Composable get() = PipetteDefinition.asImageVector()
