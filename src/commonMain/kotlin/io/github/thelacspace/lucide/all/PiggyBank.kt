package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PiggyBank") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,17.0f)
                lineTo(14.0f,17.0f)
                lineTo(14.0f,19.0f)
                curveTo(14.0f,19.552284f,14.447715f,20.0f,15.0f,20.0f)
                lineTo(17.0f,20.0f)
                curveTo(17.552284f,20.0f,18.0f,19.552284f,18.0f,19.0f)
                lineTo(18.0f,16.0f)
                curveTo(18.944466f,15.685556f,19.685556f,14.944466f,20.0f,14.0f)
                lineTo(21.0f,14.0f)
                curveTo(21.552284f,14.0f,22.0f,13.552285f,22.0f,13.0f)
                lineTo(22.0f,11.0f)
                curveTo(22.0f,10.447715f,21.552284f,10.0f,21.0f,10.0f)
                lineTo(20.0f,10.0f)
                curveTo(20.0f,8.426213f,19.25903f,6.944272f,18.0f,6.0f)
                lineTo(18.0f,3.0f)
                curveTo(16.74097f,3.0f,15.555418f,3.5927765f,14.8f,4.6f)
                lineTo(14.5f,5.0f)
                lineTo(11.0f,5.0f)
                curveTo(7.6862917f,5.0f,5.0f,7.6862917f,5.0f,11.0f)
                lineTo(5.0f,12.0f)
                curveTo(5.0f,13.573787f,5.7409706f,15.055728f,7.0f,16.0f)
                lineTo(7.0f,19.0f)
                curveTo(7.0f,19.552284f,7.4477153f,20.0f,8.0f,20.0f)
                lineTo(10.0f,20.0f)
                curveTo(10.552285f,20.0f,11.0f,19.552284f,11.0f,19.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,10.0f)
                lineTo(16.01f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,8.0f)
                lineTo(2.0f,9.0f)
                curveTo(2.0f,10.104569f,2.8954306f,11.0f,4.0f,11.0f)
                lineTo(5.0f,11.0f)
            }
}

public val LucideIcons.All.PiggyBankDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PiggyBank: ImageVector
    @Composable get() = PiggyBankDefinition.asImageVector()
