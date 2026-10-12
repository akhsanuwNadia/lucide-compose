package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Clapperboard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.296f,3.464f)
                lineTo(15.316f,7.42f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.2f,6.0f)
                lineTo(3.0f,11.0f)
                lineTo(2.1f,8.6f)
                curveTo(1.8f,7.5000005f,2.3999999f,6.4000006f,3.3999999f,6.1000004f)
                lineTo(16.9f,2.1000004f)
                curveTo(18.0f,1.8000004f,19.1f,2.4000003f,19.4f,3.4000003f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,11.0f)
                lineTo(21.0f,11.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.18f,5.276f)
                lineTo(9.28f,9.175f)
            }
}

public val LucideIcons.All.ClapperboardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Clapperboard: ImageVector
    @Composable get() = ClapperboardDefinition.asImageVector()
