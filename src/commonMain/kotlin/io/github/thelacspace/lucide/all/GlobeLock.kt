package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlobeLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.686f,15.0f)
                curveTo(15.12992f,17.629887f,13.853751f,20.05343f,12.0f,22.0f)
                curveTo(6.6666665f,16.4f,6.6666665f,7.6f,12.0f,2.0f)
                curveTo(6.870074f,2.0013378f,2.5731983f,5.884251f,2.053964f,10.987832f)
                curveTo(1.5347295f,16.091413f,4.9615684f,20.760132f,9.9861145f,21.794577f)
                curveTo(15.010661f,22.829023f,20.003021f,19.893639f,21.542f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(10.5f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,6.0f)
                lineTo(20.0f,4.0f)
                curveTo(20.003204f,3.283338f,19.62271f,2.6197395f,19.00259f,2.2604802f)
                curveTo(18.382473f,1.9012209f,17.617527f,1.9012209f,16.99741f,2.2604802f)
                curveTo(16.37729f,2.6197395f,15.996795f,3.283338f,16.0f,4.0f)
                lineTo(16.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,6.0f)
                lineTo(21.0f,6.0f)
                lineTo(22.0f,6.0f)
                lineTo(22.0f,11.0f)
                lineTo(21.0f,11.0f)
                lineTo(15.0f,11.0f)
                lineTo(14.0f,11.0f)
                lineTo(14.0f,6.0f)
                lineTo(15.0f,6.0f)
                close()
            }
}

public val LucideIcons.All.GlobeLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlobeLock: ImageVector
    @Composable get() = GlobeLockDefinition.asImageVector()
