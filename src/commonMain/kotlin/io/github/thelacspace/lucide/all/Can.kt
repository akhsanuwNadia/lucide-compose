package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Can") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,10.5)
                curveTo(20.977840423583984,11.876347541809082,16.95490074157715,12.988844871520996,12.0,12.988844871520996)
                curveTo(7.045098781585693,12.988844871520996,3.0221588611602783,11.876347541809082,3.0,10.5)
                lineTo(3.0,18.5)
                curveTo(3.0221588611602783,19.8763484954834,7.045098781585693,20.98884391784668,12.0,20.98884391784668)
                curveTo(16.95490074157715,20.98884391784668,20.977840423583984,19.8763484954834,21.0,18.5)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,10.5)
                curveTo(20.948537826538086,8.973225593566895,17.278175354003906,6.188172340393066,12.775344848632812,4.259171962738037)
                curveTo(8.272515296936035,2.330171585083008,4.619694232940674,1.9779928922653198,4.590000152587891,3.4700000286102295)
                curveTo(4.6414618492126465,4.996774196624756,8.311824798583984,7.781827926635742,12.814655303955078,9.710827827453613)
                curveTo(17.317485809326172,11.6398286819458,20.970306396484375,11.9920072555542,21.0,10.5)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,10.5)
                curveTo(2.9980218410491943,9.383398056030273,5.661961078643799,8.401817321777344,9.527000427246094,8.095000267028809)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,16.857999801635742)
                curveTo(10.995295524597168,17.052003860473633,13.004704475402832,17.052003860473633,15.0,16.857999801635742)
            }
}

public val LucideIcons.All.CanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Can: ImageVector
    @Composable get() = CanDefinition.asImageVector()
