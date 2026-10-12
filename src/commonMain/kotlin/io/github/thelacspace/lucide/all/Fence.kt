package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Fence") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(2.0,5.0)
                lineTo(2.0,20.0)
                curveTo(2.0,20.600000381469727,2.4000000953674316,21.0,3.0,21.0)
                lineTo(5.0,21.0)
                curveTo(5.599999904632568,21.0,6.0,20.600000381469727,6.0,20.0)
                lineTo(6.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,8.0)
                lineTo(10.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,18.0)
                lineTo(10.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(10.0,5.0)
                lineTo(10.0,20.0)
                curveTo(10.0,20.600000381469727,10.399999618530273,21.0,11.0,21.0)
                lineTo(13.0,21.0)
                curveTo(13.600000381469727,21.0,14.0,20.600000381469727,14.0,20.0)
                lineTo(14.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,8.0)
                lineTo(18.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,18.0)
                lineTo(18.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,3.0)
                lineTo(18.0,5.0)
                lineTo(18.0,20.0)
                curveTo(18.0,20.600000381469727,18.399999618530273,21.0,19.0,21.0)
                lineTo(21.0,21.0)
                curveTo(21.600000381469727,21.0,22.0,20.600000381469727,22.0,20.0)
                lineTo(22.0,5.0)
                close()
            }
}

public val LucideIcons.All.FenceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Fence: ImageVector
    @Composable get() = FenceDefinition.asImageVector()
