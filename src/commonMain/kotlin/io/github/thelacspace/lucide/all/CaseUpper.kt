package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CaseUpper") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,11.0f)
                lineTo(19.5f,11.0f)
                curveTo(20.876348f,11.006155f,21.988844f,12.123638f,21.988844f,13.5f)
                curveTo(21.988844f,14.876362f,20.876348f,15.993845f,19.5f,16.0f)
                lineTo(15.5f,16.0f)
                curveTo(15.223858f,16.0f,15.0f,15.776142f,15.0f,15.5f)
                lineTo(15.0f,6.5f)
                curveTo(15.0f,6.2238574f,15.223858f,6.0f,15.5f,6.0f)
                lineTo(18.5f,6.0f)
                curveTo(19.876348f,6.006155f,20.988844f,7.1236386f,20.988844f,8.5f)
                curveTo(20.988844f,9.876362f,19.876348f,10.993845f,18.5f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,16.0f)
                lineTo(6.039f,6.3100004f)
                curveTo(6.116658f,6.1237264f,6.298686f,6.0024004f,6.5004997f,6.0024004f)
                curveTo(6.702314f,6.0024004f,6.8843417f,6.1237264f,6.962f,6.3100004f)
                lineTo(11.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.304f,13.0f)
                lineTo(9.696f,13.0f)
            }
}

public val LucideIcons.All.CaseUpperDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CaseUpper: ImageVector
    @Composable get() = CaseUpperDefinition.asImageVector()
