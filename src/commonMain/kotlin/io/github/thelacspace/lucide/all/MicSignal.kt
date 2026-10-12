package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MicSignal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,11.0f)
                curveTo(18.000303f,8.856104f,16.856668f,6.874948f,15.0f,5.803f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,11.0f)
                curveTo(1.9993763f,7.4267206f,3.9054492f,4.12464f,7.0f,2.3380003f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,11.0f)
                curveTo(22.000624f,7.4267206f,20.094551f,4.12464f,17.0f,2.3380003f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,11.0f)
                curveTo(5.999697f,8.856104f,7.143331f,6.874948f,9.0f,5.803f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,21.0f)
                lineTo(15.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,9.0f)
                lineTo(12.0f,9.0f)
                lineTo(14.0f,9.0f)
                lineTo(14.0f,17.0f)
                lineTo(12.0f,17.0f)
                lineTo(12.0f,17.0f)
                lineTo(10.0f,17.0f)
                lineTo(10.0f,9.0f)
                lineTo(12.0f,9.0f)
                close()
            }
}

public val LucideIcons.All.MicSignalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MicSignal: ImageVector
    @Composable get() = MicSignalDefinition.asImageVector()
