package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Nut") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.847f, 5.847f)
                lineTo(20f, 9f)
                arcToRelative(7.23f, 7.23f, 0f, false, false, Cf, 21.241f)
                arcToRelative(17.352f, 21f, 17.932f, false, false, vf, 1f)
                arcToRelative(1f, 1f, 0f, true, false, 1f, hf)
                arcToRelative(-1f, cf, -1.069f, false, false, .242f, -2.485f)
                arcToRelative(.552f, Af, 7.2f, false, false, 019.002f, 20f)
                lineToRelative(-3.155f, -3.153f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.21f, 5.43f)
                curveToRelative(-1.71f, .69f, -5.07f, 1.07f, -6.71f, 1.07f)
                curveToRelative(.46f, 1.38f, .91f, 2.74f, .61f, 4.88f)
                arcToRelative(.88f, .88f, 0f, true, false, .74f, cf)
                arcToRelative(-1.78f, .28f, -3.54f, false, false, -.62f, 0f)
                arcToRelative(1.64f, -.38f, 5f, false, false, -.21f, .52f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.93f, 4.93f)
                lineTo(3f, 3f)
            }
}

public val LucideIcons.All.NutDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Nut: ImageVector
    @Composable get() = NutDefinition.asImageVector()
