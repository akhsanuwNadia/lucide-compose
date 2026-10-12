package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TowelRack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,7.0f)
                lineTo(20.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5f,3.0f)
                lineTo(17.5f,3.0f)
                curveTo(18.880713f,3.0f,20.0f,4.119288f,20.0f,5.5f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,20.552284f,19.552284f,21.0f,19.0f,21.0f)
                lineTo(10.0f,21.0f)
                curveTo(9.447715f,21.0f,9.0f,20.552284f,9.0f,20.0f)
                lineTo(9.0f,5.5f)
                curveTo(8.993845f,4.1236525f,7.8763614f,3.0111554f,6.5f,3.0111554f)
                curveTo(5.1236386f,3.0111554f,4.006155f,4.1236525f,4.0f,5.5f)
                lineTo(4.0f,17.0f)
                curveTo(4.0f,17.552284f,4.4477153f,18.0f,5.0f,18.0f)
                lineTo(9.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,7.0f)
                lineTo(2.0f,7.0f)
            }
}

public val LucideIcons.All.TowelRackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TowelRack: ImageVector
    @Composable get() = TowelRackDefinition.asImageVector()
