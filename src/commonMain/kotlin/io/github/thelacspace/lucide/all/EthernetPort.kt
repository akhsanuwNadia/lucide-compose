package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EthernetPort") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 8f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 8f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 17f)
                arcToRelative(2f, 2f, 0f, false, false, 1.059f, lf)
                arcToRelative(-.47f, .882f, Af, false, false, 0f, 0115f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 8f)
                verticalLineToRelative(1f)
            }
}

public val LucideIcons.All.EthernetPortDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EthernetPort: ImageVector
    @Composable get() = EthernetPortDefinition.asImageVector()
