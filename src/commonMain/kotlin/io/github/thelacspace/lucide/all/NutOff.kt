package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NutOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.868f, 11.868f)
                arcToRelative(.88f, .88f, 0f, true, false, .252f, cf)
                arcToRelative(-1.78f, .28f, -3.54f, false, false, -.62f, 0f)
                arcToRelative(1.272f, -.229f, 3.578f, false, false, af, 10f)
                arcToRelative(10f, 0f, 01f, false, true, cf, -.21f)
                arcToRelative(.52f, -.82f, .55f, false, false, af, 10f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.14f, 6.485f)
                arcToRelative(27.4f, 27.4f, 0f, false, false, Lf, 20f)
                arcToRelative(9f, af, 7.23f, false, false, 011.706f, 7.05f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.707f, 20.707f)
                arcTo(1f, 1f, 0f, false, false, hf, -1f)
                curveToRelative(-1.069f, 0f, -1.648f, .242f, -2.485f, .552f)
                arcTo(7.2f, 7.2f, 0f, false, false, lf, -3.155f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.356f, 2.7f)
                arcToRelative(10f, 10f, 0f, false, true, cf, .43f)
                arcToRelative(.35f, .4f, .97f, false, true, af, 10f)
            }
}

public val LucideIcons.All.NutOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NutOff: ImageVector
    @Composable get() = NutOffDefinition.asImageVector()
