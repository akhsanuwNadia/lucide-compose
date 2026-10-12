package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PenOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,10.0f)
                lineTo(3.843f,16.162f)
                curveTo(3.6104004f,16.39435f,3.438667f,16.680458f,3.343f,16.995f)
                lineTo(2.021f,21.355001f)
                curveTo(1.96758f,21.531246f,2.0153685f,21.72259f,2.1453822f,21.853022f)
                curveTo(2.2753959f,21.983454f,2.4665842f,22.031857f,2.643f,21.979002f)
                lineTo(7.0009995f,20.656002f)
                curveTo(7.314468f,20.559889f,7.599499f,20.388184f,7.8309994f,20.156002f)
                lineTo(14.0f,13.982f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.829f,7.172f)
                lineTo(17.188f,2.8259997f)
                curveTo(17.89896f,2.1086524f,18.9394f,1.82654f,19.91535f,2.0864863f)
                curveTo(20.8913f,2.346433f,21.653566f,3.1086998f,21.913513f,4.08465f)
                curveTo(22.17346f,5.0606003f,21.891348f,6.10104f,21.174f,6.812f)
                lineTo(16.821f,11.165f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.PenOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PenOff: ImageVector
    @Composable get() = PenOffDefinition.asImageVector()
