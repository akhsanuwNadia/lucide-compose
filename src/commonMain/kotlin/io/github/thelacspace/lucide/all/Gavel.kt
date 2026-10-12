package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gavel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,13.0)
                lineTo(5.619000434875488,21.380001068115234)
                curveTo(4.789497375488281,22.202392578125,3.4512858390808105,22.199623107910156,2.6251935958862305,21.37380599975586)
                curveTo(1.7991015911102295,20.547988891601562,1.7958862781524658,19.20977783203125,2.6180005073547363,18.380001068115234)
                lineTo(11.00200080871582,9.999001502990723)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(22.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5,10.5)
                lineTo(13.5,2.5)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(14.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,7.5)
                lineTo(16.5,15.5)
            }
}

public val LucideIcons.All.GavelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gavel: ImageVector
    @Composable get() = GavelDefinition.asImageVector()
