package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pyramid") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.5f,16.88f)
                curveTo(2.2599027f,16.739841f,2.08899f,16.506058f,2.028279f,16.234755f)
                curveTo(1.9675679f,15.963452f,2.0225391f,15.679121f,2.18f,15.449999f)
                lineTo(11.18f,2.4299984f)
                curveTo(11.367042f,2.1620326f,11.673213f,2.0023618f,12.0f,2.0023618f)
                curveTo(12.326788f,2.0023618f,12.632959f,2.1620326f,12.820001f,2.4299984f)
                lineTo(21.82f,15.439999f)
                curveTo(21.98088f,15.669798f,22.037842f,15.956603f,21.97699f,16.23044f)
                curveTo(21.916138f,16.504278f,21.743065f,16.739965f,21.5f,16.88f)
                lineTo(12.99f,21.74f)
                curveTo(12.376301f,22.089619f,11.623699f,22.089619f,11.01f,21.74f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,22.0f)
            }
}

public val LucideIcons.All.PyramidDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pyramid: ImageVector
    @Composable get() = PyramidDefinition.asImageVector()
