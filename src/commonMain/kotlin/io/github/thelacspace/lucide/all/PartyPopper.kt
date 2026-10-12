package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PartyPopper") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.8f,11.3f)
                lineTo(2.0f,22.0f)
                lineTo(12.7f,18.21f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(4.01f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,8.0f)
                lineTo(22.01f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,2.0f)
                lineTo(15.01f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,20.0f)
                lineTo(22.01f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,2.0f)
                lineTo(19.76f,2.75f)
                curveTo(18.445042f,3.1880085f,17.623825f,4.4952536f,17.8f,5.87f)
                curveTo(17.9f,6.73f,17.23f,7.5f,16.349998f,7.5f)
                lineTo(15.969998f,7.5f)
                curveTo(15.109999f,7.5f,14.369998f,8.1f,14.209998f,8.940001f)
                lineTo(14.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,13.0f)
                lineTo(21.18f,12.67f)
                curveTo(20.32f,12.33f,19.36f,12.87f,19.2f,13.78f)
                curveTo(19.09f,14.48f,18.480001f,15.0f,17.77f,15.0f)
                lineTo(17.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,2.0f)
                lineTo(11.33f,2.82f)
                curveTo(11.67f,3.6799998f,11.13f,4.64f,10.22f,4.8f)
                curveTo(9.52f,4.9f,9.0f,5.52f,9.0f,6.23f)
                lineTo(9.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,13.0f)
                curveTo(12.93f,14.93f,13.83f,17.17f,13.0f,18.0f)
                curveTo(12.17f,18.83f,9.93f,17.93f,8.0f,16.0f)
                curveTo(6.07f,14.07f,5.17f,11.83f,6.0f,11.0f)
                curveTo(6.83f,10.17f,9.07f,11.07f,11.0f,13.0f)
                close()
            }
}

public val LucideIcons.All.PartyPopperDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PartyPopper: ImageVector
    @Composable get() = PartyPopperDefinition.asImageVector()
